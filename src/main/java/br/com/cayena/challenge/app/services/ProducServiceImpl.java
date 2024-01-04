package br.com.cayena.challenge.app.services;

import br.com.cayena.challenge.ChallengeException;
import br.com.cayena.challenge.app.dto.ProductDTO;
import br.com.cayena.challenge.app.dto.QuantityControlDTO;
import br.com.cayena.challenge.app.mappers.ProductMapper;
import br.com.cayena.challenge.integrations.db.entities.Product;
import br.com.cayena.challenge.integrations.db.repositories.ProductRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProducServiceImpl implements ProductService {
    final ProductRepository productRepository;

    @Autowired
    public ProducServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDTO> listAllProducts() {
        List<Product> list =  productRepository.findAll();
       return Mappers.getMapper(ProductMapper.class).fromEntity(list);
    }

    @Override
    public ProductDTO getById(String id) {
        Optional<Product> optionalProduct = productRepository.findById(id);

        if (optionalProduct.isEmpty()) {
            throw new ChallengeException("Produto não existe");
        }
        return Mappers.getMapper(ProductMapper.class).fromEntity(optionalProduct.get());
    }

    @Override
    public ProductDTO save(ProductDTO productDTO) {

        Product entity = Mappers.getMapper(ProductMapper.class).fromDTO(productDTO);
        Product after = productRepository.save(entity);
        if (after.getId() == null) {
            throw new ChallengeException("Erro ao salvar o produto");
        }

        return Mappers.getMapper(ProductMapper.class).fromEntity(after);
    }

    @Override
    public ProductDTO update(ProductDTO productDTO) {

        Product entity = Mappers.getMapper(ProductMapper.class).toUpdate(productDTO);
        Product after = productRepository.save(entity);
        if (after.getId() == null) {
            throw new ChallengeException("Erro ao salvar o produto");
        }
        return Mappers.getMapper(ProductMapper.class).fromEntity(after);
    }

    @Override
    public void remove(String id) {
        productRepository.deleteById(id);
    }


    @Override
    public ProductDTO quantityStock(QuantityControlDTO quantityControlDTO) {
        ProductDTO entity = getById(quantityControlDTO.getProductId());

        if (quantityControlDTO.getProductEnum().name().equals("SALE")) {

            int total = entity.getQuantity() - quantityControlDTO.getQuantity();
            entity.setQuantity(total);
            update(entity);
        }
        if (quantityControlDTO.getProductEnum().name().equals("BUY")) {

            int total = entity.getQuantity() + quantityControlDTO.getQuantity();
            entity.setQuantity(total);
            update(entity);
        }
        return entity;
    }
}

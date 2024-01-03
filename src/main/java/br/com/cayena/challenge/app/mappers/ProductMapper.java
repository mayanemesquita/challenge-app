package br.com.cayena.challenge.app.mappers;

import br.com.cayena.challenge.app.dto.ProductDTO;
import br.com.cayena.challenge.integrations.db.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.UUID;

@Mapper(imports = UUID.class)
public interface ProductMapper {
    ProductDTO fromEntity(Product product);

    List<ProductDTO> fromEntity(List<Product> product);

    @Mapping(target = "id", expression = "java(UUID.randomUUID().toString())")
    Product fromDTO(ProductDTO productDTO);
}

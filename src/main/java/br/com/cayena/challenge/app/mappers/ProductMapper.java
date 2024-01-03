package br.com.cayena.challenge.app.mappers;

import br.com.cayena.challenge.app.dto.ProductDTO;
import br.com.cayena.challenge.integrations.db.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(imports = UUID.class)
public interface ProductMapper {
    ProductDTO fromEntity(Product product);

    Iterable<ProductDTO> fromEntity(Iterable<Product> product);

    @Mapping(target = "id", expression = "java(UUID.randomUUID().toString())")
    Product fromDTO(ProductDTO productDTO);
}

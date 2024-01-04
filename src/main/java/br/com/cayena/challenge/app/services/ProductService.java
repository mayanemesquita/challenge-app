package br.com.cayena.challenge.app.services;

import br.com.cayena.challenge.app.dto.ProductDTO;
import br.com.cayena.challenge.app.dto.QuantityControlDTO;

import java.util.List;

public interface ProductService {

    List<ProductDTO> listAllProducts();
    ProductDTO getById(String id);
    ProductDTO save(ProductDTO productDTO);
    ProductDTO update(ProductDTO productDTO);

    void remove (String id);
    ProductDTO quantityStock( QuantityControlDTO quantityControlDTO);
}

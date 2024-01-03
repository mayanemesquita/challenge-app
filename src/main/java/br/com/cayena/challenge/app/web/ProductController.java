package br.com.cayena.challenge.app.web;

import br.com.cayena.challenge.app.dto.ProductDTO;
import br.com.cayena.challenge.app.services.ProductService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

@RestController(value = "/v1/product")
@Produces(MediaType.APPLICATION_JSON_VALUE)
@Consumes(MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public Iterable<ProductDTO> getAll(){
      return  productService.listAllProducts();
    }
}

package br.com.cayena.challenge.app.web;

import br.com.cayena.challenge.app.dto.ProductDTO;
import br.com.cayena.challenge.app.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import java.util.List;

@RestController
@RequestMapping("/v1/products")
@Produces(MediaType.APPLICATION_JSON_VALUE)
@Consumes(MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public ResponseEntity<List<ProductDTO>> getAll(){
        return new ResponseEntity<>(productService.listAllProducts(), HttpStatus.OK);
    }
}

package br.com.cayena.challenge.integrations.db.repositories;

import br.com.cayena.challenge.integrations.db.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {
}

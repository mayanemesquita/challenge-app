package br.com.cayena.challenge.integrations.db.repositories;

import br.com.cayena.challenge.integrations.db.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}

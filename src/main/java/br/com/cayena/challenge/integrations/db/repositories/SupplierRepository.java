package br.com.cayena.challenge.integrations.db.repositories;

import br.com.cayena.challenge.integrations.db.entities.Supplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier, String> {
}

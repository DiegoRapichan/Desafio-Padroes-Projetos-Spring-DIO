package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//ClienteRepositorio que extende CrudRepository
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}

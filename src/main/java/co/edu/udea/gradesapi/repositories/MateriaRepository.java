package co.edu.udea.gradesapi.repositories;

import co.edu.udea.gradesapi.models.MateriaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends CrudRepository<MateriaModel, Long> {
}

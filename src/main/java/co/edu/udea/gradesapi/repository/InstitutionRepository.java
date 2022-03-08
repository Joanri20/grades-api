package co.edu.udea.gradesapi.repository;

import co.edu.udea.gradesapi.model.Institution;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {
    Institution findByName(String name);

    List<Institution> findByNameContaining(String text);
}
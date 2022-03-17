package co.edu.udea.gradesapi.repository;

import co.edu.udea.gradesapi.model.NoteDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteDefinitionRepository extends JpaRepository<NoteDefinition, Long> {

    List<NoteDefinition> findBySubjectId(String subjectId);

}
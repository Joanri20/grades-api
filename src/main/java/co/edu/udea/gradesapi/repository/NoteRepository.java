package co.edu.udea.gradesapi.repository;

import co.edu.udea.gradesapi.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
   List<Note> findByNoteDefinitionId(String definitionId);
   List<Note> findByUserId(String userId);
}
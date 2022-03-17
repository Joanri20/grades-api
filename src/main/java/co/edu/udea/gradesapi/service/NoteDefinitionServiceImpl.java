package co.edu.udea.gradesapi.service;

import co.edu.udea.gradesapi.model.NoteDefinition;
import co.edu.udea.gradesapi.repository.NoteDefinitionRepository;
import co.edu.udea.gradesapi.utils.Messages;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class NoteDefinitionServiceImpl implements  NoteDefinitionService  {
    private final NoteDefinitionRepository noteDefinitionRepository;
    private Messages messages;

    @Override
    public List<NoteDefinition> getNoteDefinitions() {
        return noteDefinitionRepository.findAll();
    }

    @Override
    public List<NoteDefinition> getNoteDefinitionsBySubjectId(String subject) {
        return noteDefinitionRepository.findBySubjectId(subject);
    }

    @Override
    public NoteDefinition saveNoteDefinition(NoteDefinition noteDefinition) {
        return noteDefinitionRepository.save(noteDefinition);
    }

    @Override
    public void deleNoteDefinition(NoteDefinition noteDefinition) {
        noteDefinitionRepository.delete(noteDefinition);
    }
}

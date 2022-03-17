package co.edu.udea.gradesapi.service;

import co.edu.udea.gradesapi.model.NoteDefinition;


import java.util.List;

public interface NoteDefinitionService {
    List<NoteDefinition> getNoteDefinitions();
    List<NoteDefinition> getNoteDefinitionsBySubjectId(String subject);
    NoteDefinition saveNoteDefinition(NoteDefinition noteDefinition);
    void deleNoteDefinition(NoteDefinition noteDefinition);

}

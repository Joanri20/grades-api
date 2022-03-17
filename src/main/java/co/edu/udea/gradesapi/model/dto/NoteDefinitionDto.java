package co.edu.udea.gradesapi.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class NoteDefinitionDto implements Serializable {
    private final Long id;
    private final String description;
    private final Integer percentage;
    private final String subjectId;
}

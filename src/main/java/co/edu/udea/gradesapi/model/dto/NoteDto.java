package co.edu.udea.gradesapi.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class NoteDto implements Serializable {
    private final Long id;
    private final Integer notedefinitionId;
    private final Integer userId;
    private final Integer note;
}

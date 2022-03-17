package co.edu.udea.gradesapi.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class SubjectRegistrationDto implements Serializable {
    private final Long id;
    private final Long studentId;
    private final Long subjectId;
}

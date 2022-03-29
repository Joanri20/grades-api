package co.edu.udea.gradesapi.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class SubjectRegistrationDto implements Serializable {
    private final Long id;
    @NotBlank
    private final Long studentId;
    @NotBlank
    private final Long subjectId;
}

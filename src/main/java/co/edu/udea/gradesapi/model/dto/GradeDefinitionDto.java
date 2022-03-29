package co.edu.udea.gradesapi.model.dto;

import co.edu.udea.gradesapi.model.dto.GradeDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Set;

@Data
public class GradeDefinitionDto implements Serializable {
    private final Long id;
    @NotBlank
    private final Long subjectId;
    @NotBlank
    @Schema(example = "Examen 1")
    @Size(max = 40)
    private final String name;
    @Schema(example= "Examen sobre casos de factorización")
    @Size(max = 100)
    private final String description;
    @NotBlank
    @Schema(example = "20.0")
    @DecimalMax(value="100.0")
    @DecimalMin(value="0.0")
    private final Double percentage;
    private final Set<GradeDto> grades;
}

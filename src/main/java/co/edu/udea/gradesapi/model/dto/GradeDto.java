package co.edu.udea.gradesapi.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class GradeDto implements Serializable {
    private final Long id;
    @NotBlank
    private final Long gradeDefinitionId;
    @NotBlank
    private final Long studentGradeId;
    @NotBlank
    @Schema(example = "4.8")
    @DecimalMax(value="5.0")
    @DecimalMin(value="0.0")
    private final Double value;
    @NotBlank
    @Schema(example = "Se cumplio con el objetivo planteado de la actividad")
    @Size(max = 200)
    private final String comment;
    @NotBlank
    @Schema(example = "close")
    @Size(max = 10)
    private final String status;

}

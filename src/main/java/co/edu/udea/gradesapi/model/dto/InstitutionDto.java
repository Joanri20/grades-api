package co.edu.udea.gradesapi.model.dto;

import co.edu.udea.gradesapi.utils.ValidatorConstants;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class InstitutionDto implements Serializable {


    private final Long id;
    @NotNull
    @Schema(example = "Jose Emilio Botero", description = "The name of the institution")
    @Size(min = ValidatorConstants.MIN_SIZE_NAME, max = ValidatorConstants.MAX_SIZE_NAME)
    private final String name;
    private final String address;
    private final String phone;
    @Pattern(regexp = ValidatorConstants.REGEX_EMAIL)
    private final String email;
    private final String web;
    private final String description;
}

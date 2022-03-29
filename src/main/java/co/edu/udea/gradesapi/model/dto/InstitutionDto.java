package co.edu.udea.gradesapi.model.dto;

import co.edu.udea.gradesapi.utils.ValidatorConstants;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class InstitutionDto implements Serializable {


    private final Long id;
    @NotBlank
    @Schema(example = "Jose Emilio Botero", description = "The name of the institution")
    @Size(min = 2, max = 30)
    private final String name;
    @Schema(example = "Calle 123 #123-123", description = "The address of the institution")
    @Size(max = 40)
    private final String address;
    @Schema(example = "987985987", description = "The phone number of the institution")
    @Size(max = 25)
    private final String phone;
    @Schema(example = "institution@mail.com", description = "email of the institution")
    @Pattern(regexp = ValidatorConstants.REGEX_EMAIL, message = "validation.email.invalid")
    @Size(max = 25)
    private final String email;
    @Schema(example = "http://www.institution.com", description = "The website of the institution")
    @Size(max = 35)
    private final String web;
    @Schema(example = "Institucion publica")
    @Size(max = 250)
    private final String description;

    private final Boolean active;
}

package co.edu.udea.gradesapi.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;


import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import static co.edu.udea.gradesapi.utils.ValidatorConstants.REGEX_MODEL;

@Data
public class PeriodDto implements Serializable {

    private final Long id;
    @NotBlank
    @Schema(example = "2022")
    @Pattern(regexp=REGEX_MODEL)
    private final Integer year;
    @NotBlank
    private final Integer index;
    @NotBlank
    @DateTimeFormat
    private final LocalDate startDate;
    @NotBlank
    @DateTimeFormat
    private final LocalDate endDate;
    @NotBlank
    @Schema(example = "Active", description = "Status of academic period")
    @Size(max = 35)
    private final String status;
    private final Set<Subjects> subjects;

    @Data
    public static class Subjects implements Serializable {
        private final Long id;
        @NotBlank
        @Schema(example = "Examen 1")
        @Size(max = 40)
        private final String name;
        @Min(value = 1)
        @Max(value= 4)
        private final int gradeStage;
    }



}

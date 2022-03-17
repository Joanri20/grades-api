package co.edu.udea.gradesapi.model.dto;

import co.edu.udea.gradesapi.model.dto.GradeDto;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class GradeDefinitionDto implements Serializable {
    private final Long id;
    private final Long subjectId;
    private final String name;
    private final String description;
    private final Double minValue;
    private final Double maxValue;
    private final Double percentage;
    private final Set<GradeDto> grades;
}

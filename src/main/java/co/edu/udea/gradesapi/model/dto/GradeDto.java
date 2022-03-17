package co.edu.udea.gradesapi.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class GradeDto implements Serializable {
    private final Long id;
    private final Long gradeDefinitionId;
    private final Long studentGradeId;
    private final Double value;
    private final String comment;
    private final String status;

}

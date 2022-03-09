package co.edu.udea.gradesapi.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class SubjectDto implements Serializable {
    private final Long id;
    private final String name;
    private final String idTutor;
    private final String periodId;
    private final String grade;
}

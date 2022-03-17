package co.edu.udea.gradesapi.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class SubjectDto implements Serializable {
    private final Long id;
    private final String name;
    private final int gradeStage;
    private final Long tutorId;
    private final Long periodId;
    private final Set<GradeDefinition> gradeDefinitions;
    private final Set<SubjectRegistration> registrations;


    @Data
    public static class GradeDefinition implements Serializable {
        private final Long id;
        private final String name;
        private final String description;
        private final Double percentage;
    }


    @Data
    public static class SubjectRegistration implements Serializable {
        private final Long id;
        private final Long studentId;
    }


}

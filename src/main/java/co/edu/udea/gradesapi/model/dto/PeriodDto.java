package co.edu.udea.gradesapi.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
public class PeriodDto implements Serializable {

    private final Long id;
    private final Integer year;
    private final Integer index;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final String status;
    private final Set<Subjects> subjects;

    @Data
    public static class Subjects implements Serializable {
        private final Long id;
        private final String name;
        private final int gradeStage;
    }
}

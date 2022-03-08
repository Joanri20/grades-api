package co.edu.udea.gradesapi.model.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PeriodDto {

    private Long id;
    private Integer year;
    private Integer index;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;


}
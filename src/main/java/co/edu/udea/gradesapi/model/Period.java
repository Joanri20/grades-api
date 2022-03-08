package co.edu.udea.gradesapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Year;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PERIODS")
public class Period {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer year;
    private Integer index;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;

    public Period(Integer year, LocalDate startDate, LocalDate endDate, String status) {
        this.year = year;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }
}
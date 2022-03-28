package co.edu.udea.gradesapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
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

    @OneToMany(mappedBy="period")
    private Set<Subject> subjects;

}

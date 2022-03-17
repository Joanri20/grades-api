package co.edu.udea.gradesapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "grade")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "value", nullable = false)
    private Double value;
    private String comment;
    private String status;

    @ManyToOne
    @JoinColumn(name = "grade_definition_id")
    private GradeDefinition gradeDefinition;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private User studentGrade;
}
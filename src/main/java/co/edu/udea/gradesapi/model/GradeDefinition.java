package co.edu.udea.gradesapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "grade_definition")
public class GradeDefinition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "min_value", nullable = false)
    private Double minValue = 0.0;

    @Column(name = "max_value", nullable = false)
    private Double maxValue = 5.0;

    @Column(name = "percentage", nullable = false)
    private Double percentage;

    @OneToMany(mappedBy = "gradeDefinition")
    private Set<Grade> grades;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    public GradeDefinition(String name, String description, Double minValue, Double maxValue, Double percentage, Subject subject) {
        this.name = name;
        this.description = description;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.percentage = percentage;
        this.subject = subject;
    }
}
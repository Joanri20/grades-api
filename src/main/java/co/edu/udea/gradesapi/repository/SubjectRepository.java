package co.edu.udea.gradesapi.repository;

import co.edu.udea.gradesapi.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
    boolean existsByNameIgnoreCase(String name);
    List<Subject> findByIdTutor(String idTutor);
    List<Subject> findByPeriodId(String periodId);
    List<Subject> findByIdTutorAndPeriodId(String idTutor, String periodId);
}
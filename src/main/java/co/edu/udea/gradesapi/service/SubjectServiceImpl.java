package co.edu.udea.gradesapi.service;


import co.edu.udea.gradesapi.exception.DataNotFoundException;
import co.edu.udea.gradesapi.model.Subject;
import co.edu.udea.gradesapi.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

import co.edu.udea.gradesapi.utils.Messages;

@RequiredArgsConstructor
@Service
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository subjectRepository;
    private Messages messages;

    @Override
    public List<Subject> getSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public List<Subject> getSubjectsByIdTutor(String text) {
        return subjectRepository.findByIdTutor(text);
    }

    @Override
    public List<Subject> getSubjectsByPeriod(String text) {
        return subjectRepository.findByPeriodId(text);
    }

    @Override
    public List<Subject> getSubjectByTutorAndPeriod(String tutor, String period) {
        return subjectRepository.findByIdTutorAndPeriodId(tutor,period);
    }

    @Override
    public Subject validateAndGetSubject(Long id) {
        return subjectRepository.findById(id)
                .orElseThrow(() -> new DataNotFoundException(String.format("exception.data_not_found.subject",id)));
    }

    @Override
    public Subject saveSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public void deleteSubject(Subject subject) {
        subjectRepository.delete(subject);

    }
}

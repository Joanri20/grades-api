package co.edu.udea.gradesapi.service;

import co.edu.udea.gradesapi.model.Subject;
import co.edu.udea.gradesapi.model.SubjectRegistration;
import co.edu.udea.gradesapi.model.User;
import co.edu.udea.gradesapi.repository.SubjectRegistrationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class SubjectRegistrationServiceImpl implements SubjectRegistrationService {

    private final SubjectRegistrationRepository subjectRegistrationRepository;
    private final SubjectService subjectService;
    private final UserService userService;

    @Override
    public SubjectRegistration getSubjectRegistration(Long id) {
        return null;
    }

    @Override
    public SubjectRegistration saveSubjectRegistration(SubjectRegistration subjectRegistration) {
        return null;
    }

    @Override
    public SubjectRegistration updateSubjectRegistration(SubjectRegistration subjectRegistration) {
        return null;
    }

    @Override
    public void deleteSubjectRegistration(Long id) {

    }

    @Override
    public SubjectRegistration registerSubject(Long subjectId, Long studentId) {
        //if user no existe -- excepcion
        Optional<User> user = userService.getUserById(studentId);
        Optional<Subject> subject = subjectService.getSubjectById(subjectId);
        return registerSubject(subject.get().getId(), user.get().getId());
    }

    @Override
    public void unregisterSubject(Long subjectId, Long studentId) {
        //borrar la matricula

    }



    @Override
    public List<SubjectRegistration> registerSubjects(Long studentId, Long[] subjectIds) {
        return null;
    }

    @Override
    public void unregisterSubjects(Long studentId, Long[] subjectIds) {

    }
}

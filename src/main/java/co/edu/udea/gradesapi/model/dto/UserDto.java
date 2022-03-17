package co.edu.udea.gradesapi.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
public class UserDto implements Serializable {
    private final Long id;
    private final Long identityNumber;
    private final String username;
    private final String password;
    private final String email;
    private final String role;
    private final String names;
    private final String lastNames;
    private final String phone;
    private final String address;
    private final String city;
    private final String gender;
    private final String gradeStage;
    private final String profession;
    private final Long subjectTutorId;
    private final Set<SubjectRegistrationDto> registrations;
    private final List<GradeDto> grades;
}

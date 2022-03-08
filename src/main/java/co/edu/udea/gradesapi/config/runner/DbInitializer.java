package co.edu.udea.gradesapi.config.runner;

import co.edu.udea.gradesapi.config.security.WebSecurityConfig;
import co.edu.udea.gradesapi.model.Period;
import co.edu.udea.gradesapi.model.User;
import co.edu.udea.gradesapi.service.PeriodService;
import co.edu.udea.gradesapi.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Component
public class DbInitializer implements CommandLineRunner {

    private final UserService userService;
    private final PeriodService periodService;

    @Override
    public void run(String... args) {
        if (!userService.getUsers().isEmpty()) {
            return;
        }
        USERS.forEach(userService::saveUser);
       // getPeriods().forEach(periodService::savePeriod);
        log.info("Database initialized");
    }

    /*private List<Period> getPeriods() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-m-dd");
        return Arrays.stream(PERIODS_STR.split("\n"))
                .map(periodInfoStr -> periodInfoStr.split(";"))
                .map(periodInfoArr -> new Period(Year.parse(periodInfoArr[1]), LocalDate.parse(periodInfoArr[2],df), LocalDate.parse(periodInfoArr[3],df), periodInfoArr[4]))
                .collect(Collectors.toList());
    }
*/
    private static final List<User> USERS = Arrays.asList(
            User.builder()
                    .username("admin")
                    .password("admin")
                    .email("admin@mail.com")
                    .role(WebSecurityConfig.ADMIN)
                    .build(),
            User.builder()
                    .username("student")
                    .password("student")
                    .email("student@mail.com")
                    .role(WebSecurityConfig.STUDENT)
                    .build(),
            User.builder()
                    .username("tutor")
                    .password("tutor")
                    .email("tutor@mail.com")
                    .role(WebSecurityConfig.TUTOR)
                    .build()
    );

    private static final String PERIODS_STR = "1;2022;2022-1-13;2022-3-15;IN COURSE\n"
            + "2;2022;2022-3-16;2022-5-15;PENDING\n"
            + "3;2022;2022-7-16;2022-9-15;PENDING\n"
            + "4;2022;2022-9-16;2022-11-30;PENDING\n";

}
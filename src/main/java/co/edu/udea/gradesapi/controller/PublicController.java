package co.edu.udea.gradesapi.controller;

import co.edu.udea.gradesapi.service.PeriodService;
import co.edu.udea.gradesapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/public")
public class PublicController {

    private final UserService userService;
    private final PeriodService periodService;

    @GetMapping("/numberOfUsers")
    public Integer getNumberOfUsers() {
        return userService.getUsers().size();
    }

    @GetMapping("/numberOfBooks")
    public Integer getNumberOfBooks() {
        return periodService.getPeriods().size();
    }
}

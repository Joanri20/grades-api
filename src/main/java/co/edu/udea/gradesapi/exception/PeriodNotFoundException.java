package co.edu.udea.gradesapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PeriodNotFoundException extends RuntimeException {

    public PeriodNotFoundException(String message) {
        super(message);
    }
    
}

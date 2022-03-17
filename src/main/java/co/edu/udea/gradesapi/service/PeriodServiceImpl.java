package co.edu.udea.gradesapi.service;

import co.edu.udea.gradesapi.exception.DataNotFoundException;
import co.edu.udea.gradesapi.exception.PeriodNotFoundException;
import co.edu.udea.gradesapi.model.Period;
import co.edu.udea.gradesapi.repository.PeriodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PeriodServiceImpl implements PeriodService {

    private final PeriodRepository periodRepository;

    @Override
    public List<Period> getPeriods() {
        return periodRepository.findAll();
    }

    @Override
    public List<Period> getPeriodsContainingText(String text) {
        return periodRepository.findByYear(text);
    }

    @Override
    public Period validateAndGetPeriod(Long id) {
        return periodRepository.findById(String.valueOf(id))
                .orElseThrow(() -> new DataNotFoundException(String.format("Period with id %s not found", id)));
    }

    @Override
    public Period savePeriod(Period period) {
        return periodRepository.save(period);
    }

    @Override
    public void deletePeriod(Period period) {
        periodRepository.delete(period);
    }
}

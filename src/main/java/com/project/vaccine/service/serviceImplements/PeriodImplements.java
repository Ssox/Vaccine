package com.project.vaccine.service.serviceImplements;

import com.project.vaccine.model.Period;
import com.project.vaccine.repository.PeriodRepository;
import com.project.vaccine.service.PeriodService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PeriodImplements implements PeriodService {

    @Autowired
    PeriodRepository periodRepository;

    @Override
    public List<Period> findAll() {
        return periodRepository.findAll();
    }

    @Override
    public Period findById(long id) {
        return periodRepository.findById(id).get();
    }

    @Override
    public Period save(Period period) {
        return periodRepository.save(period);
    }
}

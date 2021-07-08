package com.project.vaccine.service.serviceImplements;

import com.project.vaccine.model.Period;
import com.project.vaccine.repository.PeriodRepository;
import com.project.vaccine.service.PeriodService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PeriodImplements {

    @Autowired
    private PeriodRepository periodRepository;

    public List<Period> findAll() {
        return periodRepository.findAll();
    }

    public Period findById(long id) {
        return periodRepository.findById(id).get();
    }

    public Period save(Period period) {
        return periodRepository.save(period);
    }
}

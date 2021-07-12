package com.project.vaccine.service;

import com.project.vaccine.model.Period;
import com.project.vaccine.repository.PeriodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeriodService {

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

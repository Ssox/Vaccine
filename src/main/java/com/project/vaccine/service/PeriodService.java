package com.project.vaccine.service;

import com.project.vaccine.model.Period;

import java.util.List;

public interface PeriodService {

    List<Period> findAll();
    Period findById(long id);
    Period save(Period period);
}

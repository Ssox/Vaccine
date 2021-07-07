package com.project.vaccine.service;

import com.project.vaccine.model.Disease;

import java.util.List;

public interface DiseaseService {

    List<Disease> findAll();
    Disease findById(long id);
    Disease save(Disease disease);
}

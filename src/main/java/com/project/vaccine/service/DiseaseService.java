package com.project.vaccine.service;

import com.project.vaccine.model.Disease;
import com.project.vaccine.repository.DiseaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DiseaseService {

    @Autowired
    private DiseaseRepository diseaseRepository;

    public List<Disease> findAll() {
        return diseaseRepository.findAll();
    }

    public Disease findById(long id) {
        return diseaseRepository.findById(id).get();
    }

    public Disease save(Disease disease) {
        return diseaseRepository.save(disease);
    }
}

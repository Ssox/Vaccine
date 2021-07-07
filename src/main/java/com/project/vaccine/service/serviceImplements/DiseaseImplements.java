package com.project.vaccine.service.serviceImplements;

import com.project.vaccine.model.Disease;
import com.project.vaccine.repository.DiseaseRepository;
import com.project.vaccine.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DiseaseImplements implements DiseaseService {

    @Autowired
    DiseaseRepository diseaseRepository;

    @Override
    public List<Disease> findAll() {
        return diseaseRepository.findAll();
    }

    @Override
    public Disease findById(long id) {
        return diseaseRepository.findById(id).get();
    }

    @Override
    public Disease save(Disease disease) {
        return diseaseRepository.save(disease);
    }
}

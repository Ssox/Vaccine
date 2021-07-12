package com.project.vaccine.service;

import com.project.vaccine.model.Disease;
import com.project.vaccine.repository.DiseaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiseaseService {

    @Autowired
    private DiseaseRepository diseaseRepository;

    public List<Disease> findAll() {
        return diseaseRepository.findAll();
    }

    public Disease findById(long id) {
        return diseaseRepository.findById(id).get();
    }

//    public List<Disease> findByVaccineId(@PathVariable("id") long id) {
//        List<Disease> diseaseFind = diseaseRepository.findAll();
//        List<Disease> diseases = new ArrayList<>();
//        diseaseFind.forEach(doc -> {
//            System.out.println(doc.getVaccine().getId());
//            if(doc.getVaccine().getId().equals(id)) {
//                diseases.add(doc);
//            }
//        });
//        return diseases;
//    }

    public Disease save(Disease disease) {
        return diseaseRepository.save(disease);
    }
}

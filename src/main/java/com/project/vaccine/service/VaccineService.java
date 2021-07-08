package com.project.vaccine.service;

import com.project.vaccine.model.Vaccine;
import com.project.vaccine.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineService {

    @Autowired
    private VaccineRepository vaccineRepository;

    public List<Vaccine> findAll() {
        return vaccineRepository.findAll();
    }

    public Vaccine findById(long id) {
        return vaccineRepository.findById(id).get();
    }

    public Vaccine save(Vaccine vaccine) {
        return vaccineRepository.save(vaccine);
    }
}

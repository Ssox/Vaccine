package com.project.vaccine.service.serviceImplements;


import com.project.vaccine.model.Vaccine;
import com.project.vaccine.repository.VaccineRepository;
import com.project.vaccine.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineImplements implements VaccineService {

    @Autowired
    VaccineRepository vaccineRepository;

    @Override
    public List<Vaccine> findAll() {
        return vaccineRepository.findAll();
    }

    @Override
    public Vaccine findById(long id) {
        return vaccineRepository.findById(id).get();
    }

    @Override
    public Vaccine save(Vaccine vaccine) {
        return vaccineRepository.save(vaccine);
    }
}

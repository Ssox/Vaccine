package com.project.vaccine.service.serviceImplements;


import com.project.vaccine.model.Vaccine;
import com.project.vaccine.repository.VaccineRepository;
import com.project.vaccine.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineImplements {

    @Autowired
    private VaccineRepository vaccineRepository;


    public List<Vaccine> buscar() {
        return vaccineRepository.findAll();
    }

    public Vaccine findById(long id) {
        return vaccineRepository.findById(id).get();
    }

    public Vaccine save(Vaccine vaccine) {
        return vaccineRepository.save(vaccine);
    }
}

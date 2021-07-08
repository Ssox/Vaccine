package com.project.vaccine.service;

import com.project.vaccine.model.Vaccine;

import java.util.List;

public interface VaccineService {

    List<Vaccine> buscar();
    Vaccine findById(long id);
    Vaccine save(Vaccine vaccine);
}

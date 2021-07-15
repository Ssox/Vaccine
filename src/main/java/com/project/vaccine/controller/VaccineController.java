package com.project.vaccine.controller;

import com.project.vaccine.model.Disease;
import com.project.vaccine.model.Period;
import com.project.vaccine.model.Vaccine;
import com.project.vaccine.service.DiseaseService;
import com.project.vaccine.service.PeriodService;
import com.project.vaccine.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vaccine")
public class VaccineController {

    @Autowired
    private DiseaseService diseaseService;

    @Autowired
    private VaccineService vaccineService;

    @Autowired
    private PeriodService periodService;


    @GetMapping("/all")
    public List<Vaccine> getAllVaccines() {
        return vaccineService.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> addVaccine(@RequestBody Vaccine vaccine) {
        Vaccine vaccine1 = vaccineService.save(vaccine);
        for (Disease disease : vaccine1.getDiseases()) {
            disease.setVaccine(vaccine1);
            diseaseService.save(disease);
        }
        return ResponseEntity.ok("Cadastrado com sucesso");
    }

    @GetMapping("/period/all")
    public List<Period> getAllPeriods() {
        return periodService.findAll();
    }
}

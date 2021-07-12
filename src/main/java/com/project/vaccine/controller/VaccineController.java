package com.project.vaccine.controller;

import com.project.vaccine.model.Disease;
import com.project.vaccine.model.Vaccine;
import com.project.vaccine.service.DiseaseService;
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
@RequestMapping(value = "/vaccine")
public class VaccineController {

    @Autowired
    private DiseaseService diseaseService;

    @Autowired
    private VaccineService vaccineService;


    @GetMapping("/all")
    public List<Vaccine> getAllVaccines() {
        return vaccineService.findAll();
    }

    @PostMapping("/addVaccine")
    public String addVaccine(@RequestBody Vaccine vaccine) {
        System.out.println(vaccine.getName());
        return "OK";
    }


}

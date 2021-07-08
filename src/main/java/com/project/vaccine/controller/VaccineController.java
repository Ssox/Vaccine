package com.project.vaccine.controller;


import com.project.vaccine.model.Vaccine;
import com.project.vaccine.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class VaccineController {

    @Autowired
    private VaccineService vaccineService;

    @GetMapping(value = "/vaccines")
    public ModelAndView getVaccines() {
        ModelAndView mv = new ModelAndView("vaccines");
        List<Vaccine> vaccines = vaccineService.buscar();
        mv.addObject("vaccines", vaccines);
        return mv;
    }
}

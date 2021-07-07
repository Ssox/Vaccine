package com.project.vaccine.controller;


import com.project.vaccine.model.Vaccine;
import com.project.vaccine.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class VaccineController {

    @Autowired
    VaccineService vaccineService;

    @RequestMapping(value = "/vaccines", method = RequestMethod.GET)
    public ModelAndView getVaccines() {
        ModelAndView mv = new ModelAndView("vaccines");
        List<Vaccine> vaccines = vaccineService.findAll();
        mv.addObject("vaccines", vaccines);
        return mv;
    }
}

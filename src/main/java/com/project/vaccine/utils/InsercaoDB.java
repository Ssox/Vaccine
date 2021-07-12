package com.project.vaccine.utils;


import com.project.vaccine.model.Disease;
import com.project.vaccine.model.Period;
import com.project.vaccine.model.Vaccine;
import com.project.vaccine.repository.DiseaseRepository;
import com.project.vaccine.repository.PeriodRepository;
import com.project.vaccine.repository.VaccineRepository;
import com.project.vaccine.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class InsercaoDB {

    @Autowired
    private VaccineRepository vaccineRepository;

    @Autowired
    private DiseaseService diseaseRepository;

    @Autowired
    private PeriodRepository periodRepository;

//    @PostConstruct
    public void saveVaccine() {

        Disease disease = new Disease();
        disease.setName("Tuberculose");
        disease.setDescription("A tuberculose é uma infecção causada pela bactéria Mycobacterium tuberculosis.");
        disease.setTransmission("A bactéria causadora da tuberculose pode ser transmitida por gotículas para");
        disease.setRisk("Em crianças, a tuberculose ocorre com mais frequência nas menores de 5 anos. Bebês e");
        disease.setSymptoms("Aproximadamente um terço da população mundial carrega a bactéria, mas não apresenta");
        List<Vaccine> vaccineList = vaccineRepository.findAll();
        Vaccine testeVaccine = new Vaccine();
        for (Vaccine vaccine: vaccineList) {
            if (vaccine.getName().equals("BCG")) {
                System.out.println(vaccine.getName());
                testeVaccine = vaccine;
            }
        }
        disease.setVaccine(testeVaccine);
        Disease teste = diseaseRepository.save(disease);
        System.out.println(teste.getName());


//        Vaccine vaccine = new Vaccine();
//        vaccine.setName("BCG");
//        vaccine.setDescription("A vacina BCG ajuda a proteger contras formas graves de tuberculose.");
////        List<Disease> diseaseList = diseaseRepository.findAll();
////        for (Disease disease: diseaseList) {
////            if (disease.getName().equals("Tuberculose")) {
////                System.out.println(disease.getName());
////                vaccine.setDiseases(diseaseList);
////            }
////        }
////        List<Period> periodList = periodRepository.findAll();
////        vaccine.setPeriods(periodList);
//        Vaccine teste = vaccineRepository.save(vaccine);
//        System.out.println(teste.getName());
//



//        Period period = new Period();
//        period.setPeriod("Ao nascer");
//        period.setMonths(0);
//        periodRepository.save(period);

    }
}

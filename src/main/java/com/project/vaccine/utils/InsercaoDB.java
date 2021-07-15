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

    @PostConstruct
    public void saveVaccine() {

//        Disease disease = new Disease();
//        disease.setName("Tuberculose");
//        disease.setDescription("A tuberculose é uma infecção causada pela bactéria Mycobacterium tuberculosis.");
//        disease.setTransmission("A bactéria causadora da tuberculose pode ser transmitida por gotículas para");
//        disease.setRisk("Em crianças, a tuberculose ocorre com mais frequência nas menores de 5 anos. Bebês e");
//        disease.setSymptoms("Aproximadamente um terço da população mundial carrega a bactéria, mas não apresenta");
//        List<Vaccine> vaccineList = vaccineRepository.findAll();
//        Vaccine testeVaccine = new Vaccine();
//        for (Vaccine vaccine: vaccineList) {
//            if (vaccine.getName().equals("BCG")) {
//                System.out.println(vaccine.getName());
//                testeVaccine = vaccine;
//            }
//        }
//        disease.setVaccine(testeVaccine);
//        Disease teste = diseaseRepository.save(disease);
//        System.out.println(teste.getName());


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



        Period period = new Period();
        period.setId(1L);
        period.setPeriod("Ao Nascer");
        period.setMonths(0);
        periodRepository.save(period);

        Period period2 = new Period();
        period2.setId(2L);
        period2.setPeriod("2 Meses");
        period2.setMonths(2);
        periodRepository.save(period2);

        Period period3 = new Period();
        period3.setId(3L);
        period3.setPeriod("3 Meses");
        period3.setMonths(3);
        periodRepository.save(period3);

        Period period4 = new Period();
        period4.setId(4L);
        period4.setPeriod("4 Meses");
        period4.setMonths(4);
        periodRepository.save(period4);

        Period period5 = new Period();
        period5.setId(5L);
        period5.setPeriod("5 Meses");
        period5.setMonths(5);
        periodRepository.save(period5);

        Period period6 = new Period();
        period6.setId(6L);
        period6.setPeriod("6 Meses");
        period6.setMonths(6);
        periodRepository.save(period6);

    }
}

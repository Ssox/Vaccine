package com.project.vaccine.utils;


import com.project.vaccine.model.Disease;
import com.project.vaccine.model.Vaccine;
import com.project.vaccine.repository.DiseaseRepository;
import com.project.vaccine.repository.PeriodRepository;
import com.project.vaccine.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class InsercaoDB {

    @Autowired
    VaccineRepository vaccineRepository;

    @Autowired
    DiseaseRepository diseaseRepository;

    @Autowired
    PeriodRepository periodRepository;

//    @PostConstruct
    public void saveVaccine() {

//        Disease disease = new Disease();
//        disease.setName("Tuberculose");
//        disease.setDescription("A tuberculose é uma infecção causada pela bactéria Mycobacterium tuberculosis. A vacina Bacille Calmette-Guérin (BCG) foi desenvolvida para ajudar a proteger contra as formas graves de tuberculose.");
//        disease.setTransmission("A bactéria causadora da tuberculose pode ser transmitida por gotículas para outras pessoas, através de tosse, espirros ou saliva. Quando uma pessoa respira bactérias da tuberculose, essas bactérias podem se acomodar nos pulmões e começar a crescer. A partir daí, elas podem passar através do sangue para outras partes do corpo, como rins, coluna e cérebro. ");
//        disease.setRisk("Em crianças, a tuberculose ocorre com mais frequência nas menores de 5 anos. Bebês e crianças pequenas (especialmente aquelas com menos de 2 anos) correm o risco de desenvolver doenças graves associadas a uma alta taxa de mortalidade. Pessoas com condições médicas que enfraquecem o sistema imunológico, especialmente aquelas com infecção por HIV, correm maior risco de desenvolver tuberculose.");
//        disease.setSymptoms("Aproximadamente um terço da população mundial carrega a bactéria, mas não apresenta sintomas (infecção latente); no entanto, aproximadamente 10% dessas pessoas provavelmente desenvolverão a doença durante sua vida e serão capazes de contaminar outras pessoas. Os sintomas e sinais de tuberculose podem variar de acordo com a idade, o estado imunológico, a parte do corpo afetada e a gravidade da doença. Os sintomas clássicos da tuberculose incluem tosse crônica (duração de 3 semanas ou mais), presença de sangue ou catarro na tosse, dor no peito, febre moderada, sudorese noturna, fraqueza ou fadiga, redução do apetite e perda de peso.");
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
//        List<Disease> diseaseList = diseaseRepository.findAll();
//        for (Disease disease: diseaseList) {
//            if (disease.getName().equals("Tuberculose")) {
//                System.out.println(disease.getName());
//                disease.setVaccine(vaccine);
//                vaccine.setDiseases(diseaseList);
//                Vaccine teste = vaccineRepository.save(vaccine);
//            }
//        }



//        System.out.println(teste.getName());
//
//
//        Period period = new Period();
//        period.setPeriod("Ao nascer");
//        period.setMonths(0);
//        periodRepository.save(period);

    }
}

package com.project.vaccine.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.project.vaccine.controller.VaccineController;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="TB_VACCINE")
public class Vaccine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @JsonManagedReference
    @OneToMany(mappedBy = "vaccine")
    List<Disease> diseases = new ArrayList<Disease>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "vaccine_period",
            joinColumns = {@JoinColumn(name = "vaccine_id")},
            inverseJoinColumns = {@JoinColumn(name = "period_id")})
    private List<Period> periods;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Period> getPeriods() {
        return periods;
    }

    public void setPeriods(List<Period> periods) {
        this.periods = periods;
    }

    public List<Disease> getDiseases() {
        return diseases;
    }

    public void setDiseases(List<Disease> diseases) {
        this.diseases = diseases;
    }
}

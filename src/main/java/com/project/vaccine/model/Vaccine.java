package com.project.vaccine.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name="TB_VACCINE")
public class Vaccine {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    @Lob
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vaccine")
    private List<Disease> diseases;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "vaccine_period",
            joinColumns = @JoinColumn(name = "vaccine_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "period_id", referencedColumnName = "id"))
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

    public List<Disease> getDiseases() {
        return diseases;
    }

    public void setDiseases(List<Disease> diseases) {
        this.diseases = diseases;
    }

    public List<Period> getPeriods() {
        return periods;
    }

    public void setPeriods(List<Period> periods) {
        this.periods = periods;
    }
}

package com.project.vaccine.repository;

import com.project.vaccine.model.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccineRepository extends JpaRepository<Vaccine, Long> {
}

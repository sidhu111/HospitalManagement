package com.htc.patient.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.htc.patient.entity.Patient;

public interface PatientInterface extends JpaRepository<Patient, Long>{

}

package com.htc.doctormanagement.dto;

import java.util.List;

import com.htc.doctormanagement.entity.Appointment;

public class DoctorDto {
	
	public DoctorDto(String doctorName, String specialization, List<Appointment> appointment) {
		super();
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.appointment = appointment;
	}
	public DoctorDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String doctorName;
	private String specialization;
	private List<Appointment> appointment;
	@Override
	public String toString() {
		return "DoctorDto [doctorName=" + doctorName + ", specialization=" + specialization + ", appointment="
				+ appointment + "]";
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public List<Appointment> getAppointment() {
		return appointment;
	}
	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}

}

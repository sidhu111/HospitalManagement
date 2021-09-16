package com.htc.doctormanagement;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.htc.doctormanagement.dao.AppointmentInterface;
import com.htc.doctormanagement.entity.Appointment;

@SpringBootTest
class DoctormanagementApplicationTests {
	
	@Autowired
	AppointmentInterface appointmentInterface;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testAppointment() {
		Appointment appointment = new Appointment();
		appointment.setAppointmentId(1L);
		appointment.setAppointmentDate(LocalDate.now());
		appointment.setDoctorId(2L);
		
		appointmentInterface.save(appointment);
		
		assertNotNull(appointmentInterface.findById(1L).get());
	}

	private void assertNotNull(Appointment appointment) {
		// TODO Auto-generated method stub
		
	}


	
}

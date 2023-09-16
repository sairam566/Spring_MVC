package com.tsr.controller;

import java.security.SecureRandom;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.tsr.dto.AppointmentDto;

public class BookAppointmentController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView view = new ModelAndView();
		AppointmentDto appointment = new AppointmentDto();

		LocalDateTime appointmentDate = LocalDateTime.parse(request.getParameter("appointmentDate")); // 2007-12-03T10:15:30
		appointment.setAppointmentNo(new SecureRandom().nextInt(1000000));
		appointment.setPatientName(request.getParameter("patientName"));
		appointment.setDoctorName(request.getParameter("doctorName"));
		appointment.setAppointmentDate(appointmentDate);

		view.addObject("appointment", appointment);
		view.setViewName("Appointment-Details");
		return view;
	}

}

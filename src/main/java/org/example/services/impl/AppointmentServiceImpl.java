package org.example.services.impl;

import org.example.models.Appointment;
import org.example.repositories.AppointmentRepository;
import org.example.services.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public void saveAppointment(Appointment appointment) {
        appointmentRepository.saveAppointment(appointment);
    }

    @Override
    public Appointment findByIdAppointment(Long id) {
        return null;
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return null;
    }

    @Override
    public void deleteByIdAppointment(Long id) {

    }

    @Override
    public void updateAppointment(Long id, Appointment appointment) {

    }
}

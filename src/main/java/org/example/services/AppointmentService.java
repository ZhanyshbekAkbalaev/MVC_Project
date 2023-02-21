package org.example.services;

import org.example.models.Appointment;

import java.util.List;

public interface AppointmentService {
    void saveAppointment(Appointment appointment);
    Appointment findByIdAppointment(Long id);
    List<Appointment> getAllAppointments();
    void deleteByIdAppointment(Long id);
    void updateAppointment(Long id, Appointment appointment);
}

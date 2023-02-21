package org.example.repositories.impl;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.example.models.Appointment;
import org.example.repositories.AppointmentRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class AppointmentRepositoryImpl implements AppointmentRepository {
    private final EntityManager entityManager;

    public AppointmentRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void saveAppointment(Appointment appointment) {
        entityManager.persist(appointment);
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

package org.example.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "appointments")
@Getter
@Setter
@NoArgsConstructor
public class Appointment {
    @Id
    @SequenceGenerator(name = "appointment_gen", sequenceName = "appointment_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appointment_gen")
    private Long id;
    private LocalDate date;
    @ManyToOne(cascade = {DETACH, MERGE, REFRESH})
    private Patient patient;
    @ManyToOne(cascade = {DETACH, MERGE, REFRESH})
    private Doctor doctor;
    @ManyToOne
    private Department department;
}

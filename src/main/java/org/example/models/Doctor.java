package org.example.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "doctors")
@Getter
@Setter
@NoArgsConstructor
public class Doctor {
    @Id
    @SequenceGenerator(name = "doctor_gen", sequenceName = "doctor_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doctor_gen")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String position;
    private String email;
    @ManyToMany(cascade = ALL, mappedBy = "doctors")
    private List<Department> departments;
    @OneToMany(cascade = ALL, mappedBy = "doctor")
    private List<Appointment> appointments;
    @ManyToOne(cascade = {DETACH, MERGE, REFRESH})
    private Hospital hospital;


}

package org.example.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.CascadeType.ALL;

@Entity
@Table(name = "hospitals")
@Getter
@Setter
@NoArgsConstructor
public class Hospital {
    @Id
    @SequenceGenerator(name = "hospital_gen", sequenceName = "hospital_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hospital_gen")
    private Long id;
    private String name;
    private String address;
    @OneToMany(cascade = ALL, mappedBy = "hospital")
    private List<Doctor> doctors;
    @OneToMany(cascade = ALL, mappedBy = "hospital")
    private List<Patient> patients;
    @OneToMany(cascade = ALL, mappedBy = "hospital")
    private List<Department> departments;
    @OneToMany(cascade = ALL)
    private List<Appointment> appointments;

}

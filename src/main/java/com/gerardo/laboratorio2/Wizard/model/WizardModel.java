package com.gerardo.laboratorio2.Wizard.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "wizards")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WizardModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "name")
    private String name;
    @Column(name = "house")
    private String house;
    @Column(name = "patronus")
    private String patronus;
    @Column(name = "isDeatheater")
    private Boolean isDeatheater;
}

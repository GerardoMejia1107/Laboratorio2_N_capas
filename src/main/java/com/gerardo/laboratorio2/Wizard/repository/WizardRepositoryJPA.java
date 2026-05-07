package com.gerardo.laboratorio2.Wizard.repository;

import com.gerardo.laboratorio2.Wizard.model.WizardModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WizardRepositoryJPA extends JpaRepository<WizardModel, UUID> {
}

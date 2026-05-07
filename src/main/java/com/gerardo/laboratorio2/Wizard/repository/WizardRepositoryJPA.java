package com.gerardo.laboratorio2.Wizard.repository;

import com.gerardo.laboratorio2.Wizard.model.WizardModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface WizardRepositoryJPA extends JpaRepository<WizardModel, UUID> {
    List<WizardModel> findByIsDeatheater(Boolean isDeatheater);

    List<WizardModel> findByPatronus(String patronus);
}

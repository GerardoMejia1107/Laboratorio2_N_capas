package com.gerardo.laboratorio2.Wizard.service;

import com.gerardo.laboratorio2.Wizard.model.WizardModel;

import java.util.List;
import java.util.UUID;

public interface WizardService {
    void createWizard(WizardModel wizard);
    List<WizardModel> getAllWizards();
    List<WizardModel> getAllByIsDeatheater(Boolean isDeatheater);
    List<WizardModel> getByPatronus(String patronus);
    WizardModel deleteWizard(UUID id);
    WizardModel updateWizard(UUID id, WizardModel request);
}

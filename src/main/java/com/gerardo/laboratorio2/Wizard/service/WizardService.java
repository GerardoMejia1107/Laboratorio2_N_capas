package com.gerardo.laboratorio2.Wizard.service;

import com.gerardo.laboratorio2.Wizard.model.WizardModel;

import java.util.List;

public interface WizardService {
    void createWizard(WizardModel wizard);
    List<WizardModel> getAllWizards();
    List<WizardModel> getAllByIsDeatheater(Boolean isDeatheater);
}

package com.gerardo.laboratorio2.Wizard.service;

import com.gerardo.laboratorio2.Wizard.model.WizardModel;
import com.gerardo.laboratorio2.Wizard.repository.WizardRepositoryJPA;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WizardServiceImp implements WizardService {
    private WizardRepositoryJPA repositoryJPA;

    @Override
    public void createWizard(WizardModel wizard) {
        repositoryJPA.save(wizard);
    }

    @Override
    public List<WizardModel> getAllWizards(){
        return repositoryJPA.findAll();
    }

    @Override
    public List<WizardModel> getAllByIsDeatheater(Boolean isDeatheater){
        return repositoryJPA.findByIsDeatheater(isDeatheater);
    }
    

}

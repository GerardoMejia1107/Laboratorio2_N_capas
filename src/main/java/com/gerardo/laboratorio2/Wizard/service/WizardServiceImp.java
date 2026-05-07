package com.gerardo.laboratorio2.Wizard.service;

import com.gerardo.laboratorio2.Wizard.model.WizardModel;
import com.gerardo.laboratorio2.Wizard.repository.WizardRepositoryJPA;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class WizardServiceImp implements WizardService {
    private WizardRepositoryJPA repositoryJPA;

    @Override
    public void createWizard(WizardModel wizard) {
        repositoryJPA.save(wizard);
    }

    @Override
    public List<WizardModel> getAllWizards() {
        return repositoryJPA.findAll();
    }

    @Override
    public List<WizardModel> getAllByIsDeatheater(Boolean isDeatheater) {
        return repositoryJPA.findByIsDeatheater(isDeatheater);
    }

    @Override
    public List<WizardModel> getByPatronus(String patronus) {
        return repositoryJPA.findByPatronus(patronus);
    }

    @Override
    public WizardModel deleteWizard(UUID id) {
        WizardModel wizard = repositoryJPA.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));

        repositoryJPA.deleteById(id);
        return wizard;
    }

    @Override
    public WizardModel updateWizard(UUID id, WizardModel request) {
        if (request.getName() == null || request.getPatronus() == null || request.getHouse() == null || request.getIsDeatheater() == null) {
            throw new RuntimeException("All fields are required");
        }
        WizardModel wizard = repositoryJPA.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));
        wizard.setName(request.getName());
        wizard.setHouse(request.getHouse());
        wizard.setIsDeatheater(request.getIsDeatheater());
        wizard.setPatronus(request.getPatronus());
        return repositoryJPA.save(wizard);
    }

}

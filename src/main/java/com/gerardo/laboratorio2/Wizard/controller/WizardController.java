package com.gerardo.laboratorio2.Wizard.controller;

import com.gerardo.laboratorio2.Wizard.model.WizardModel;
import com.gerardo.laboratorio2.Wizard.service.WizardService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class WizardController {
    private final WizardService service;

    @PostMapping("/wizards")
    public ResponseEntity<WizardModel> createWizard(@RequestBody WizardModel wizard) {
        service.createWizard(wizard);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(wizard);
    }

    @GetMapping("/wizards")
    public ResponseEntity<List<WizardModel>> getAllWizards() {
        List<WizardModel> response = service.getAllWizards();
        return ResponseEntity.ok(response);
    }

}

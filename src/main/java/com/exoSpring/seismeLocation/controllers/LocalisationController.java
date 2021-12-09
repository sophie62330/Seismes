package com.exoSpring.seismeLocation.controllers;

import com.exoSpring.seismeLocation.dtos.localisations.LocalisationDTO;
import com.exoSpring.seismeLocation.dtos.localisations.LocalisationDeleteDTO;
import com.exoSpring.seismeLocation.dtos.localisations.LocalisationSaveDTO;
import com.exoSpring.seismeLocation.dtos.localisations.LocalisationUpdateDTO;
import com.exoSpring.seismeLocation.services.LocalisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localisations")
public class LocalisationController {
    @Autowired
    LocalisationService service;

    @GetMapping
    public List<LocalisationDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<LocalisationDTO> find(@PathVariable String id) {
        LocalisationDTO localisationDTO = service.find(id);
        if (localisationDTO == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(localisationDTO);
    }

    @PostMapping
    public ResponseEntity<LocalisationDTO> save(@RequestBody LocalisationSaveDTO localisationSaveDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(localisationSaveDTO));
    }

    @PutMapping
    public ResponseEntity<LocalisationDTO> update(@RequestBody LocalisationUpdateDTO localisationUpdateDTO) {
        return ResponseEntity.ok(service.update(localisationUpdateDTO));
    }

    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestBody LocalisationDeleteDTO localisationDeleteDTO) {
        service.delete(localisationDeleteDTO);
        return ResponseEntity.ok(true);
    }
}

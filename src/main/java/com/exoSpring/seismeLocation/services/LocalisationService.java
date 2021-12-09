package com.exoSpring.seismeLocation.services;

import com.exoSpring.seismeLocation.dtos.localisations.LocalisationDTO;
import com.exoSpring.seismeLocation.dtos.localisations.LocalisationDeleteDTO;
import com.exoSpring.seismeLocation.dtos.localisations.LocalisationSaveDTO;
import com.exoSpring.seismeLocation.dtos.localisations.LocalisationUpdateDTO;
import com.exoSpring.seismeLocation.entities.Localisation;
import com.exoSpring.seismeLocation.repositories.LocalisationRepository;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LocalisationService {
    private LocalisationRepository repository;
    private ModelMapper mapper;

    public LocalisationService(ModelMapper mapper,
                       LocalisationRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public List<LocalisationDTO> findAll() {
        List<LocalisationDTO> localisations = new ArrayList<>();
        repository.findAll().forEach(localisation -> {
            localisations.add(mapper.map(localisation, LocalisationDTO.class));
        });
        return localisations;
    }

    public LocalisationDTO save(LocalisationSaveDTO localisation) {
        Localisation l = this.repository.save(this.mapper.map(localisation, Localisation.class));
        return this.mapper.map(l, LocalisationDTO.class);
    }

    public LocalisationDTO find(String id) {
        Optional<Localisation> u = repository.findById(id);
        LocalisationDTO localisationDTO = null;
        if (u.isPresent()) {
            localisationDTO = mapper.map(u, LocalisationDTO.class);
        }
        return localisationDTO;
    }

    public LocalisationDTO update(LocalisationUpdateDTO localisationDTO) {
        // Je map mon DTO en Entité
        Localisation localisationToSave = mapper.map(localisationDTO, Localisation.class);
        // Je save mon article
        Localisation localisationSaving = repository.save(localisationToSave);
        // Je transforme mon article en PostDTO
        LocalisationDTO localisationDeRetour = mapper.map(localisationSaving, LocalisationDTO.class);
        // JE retourne mon postDTO
        return localisationDeRetour;
    }



    public void delete(LocalisationDeleteDTO obj) {
        Localisation localisationToSave =  mapper.map(
                obj,
                Localisation.class
        );
        repository.delete(localisationToSave);
    }
}

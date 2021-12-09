package com.exoSpring.seismeLocation.services;

import com.exoSpring.seismeLocation.dtos.SeismeDTO;
import com.exoSpring.seismeLocation.dtos.SeismeDeleteDTO;
import com.exoSpring.seismeLocation.dtos.SeismeSaveDTO;
import com.exoSpring.seismeLocation.dtos.SeismeUpdateDTO;
import com.exoSpring.seismeLocation.dtos.localisations.LocalisationDTO;
import com.exoSpring.seismeLocation.entities.Localisation;
import com.exoSpring.seismeLocation.entities.Seisme;
import com.exoSpring.seismeLocation.repositories.SeismeRepository;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SeismeService {
    private SeismeRepository repository;
    private ModelMapper mapper;

    public SeismeService(ModelMapper mapper,
                       SeismeRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public List<SeismeDTO> findAll() {
        List<SeismeDTO> seismes = new ArrayList<>();
        repository.findAll().forEach(post -> {
            seismes.add(mapper.map(post, SeismeDTO.class));
        });
        return seismes;
    }

    public SeismeDTO save(SeismeSaveDTO seisme) {
        Seisme s = this.repository.save(this.mapper.map(seisme, Seisme.class));
        return this.mapper.map(s, SeismeDTO.class);
    }



    public SeismeDTO update(SeismeUpdateDTO seismeDTO) {
        // Je map mon DTO en Entité
        Seisme seismeToSave = mapper.map(seismeDTO, Seisme.class);
        // Je save mon article
        Seisme seismeSaving = repository.save(seismeToSave);
        // Je transforme mon article en PostDTO
        SeismeDTO seismeDeRetour = mapper.map(seismeSaving, SeismeDTO.class);
        // JE retourne mon postDTO
        return seismeDeRetour;
    }

    public SeismeDTO find(String id) {
        Optional<Seisme> u = repository.findById(id);
        SeismeDTO seismeDTO = null;
        if (u.isPresent()) {
            seismeDTO = mapper.map(u, SeismeDTO.class);
        }
        return seismeDTO;
    }

    public void delete(SeismeDeleteDTO obj) {
        Seisme seismeToSave =  mapper.map(
                obj,
                Seisme.class
        );
        repository.delete(seismeToSave);
    }
}

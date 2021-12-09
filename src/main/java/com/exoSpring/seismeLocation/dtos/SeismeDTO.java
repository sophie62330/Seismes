package com.exoSpring.seismeLocation.dtos;

import com.exoSpring.seismeLocation.dtos.localisations.LocalisationDTO;

public class SeismeDTO {
    private String id;

    private String nom;

    private String magnitude;

    private LocalisationDTO localisationDTO;

    private String date_seisme;

    public SeismeDTO(String id, String nom, String magnitude, LocalisationDTO localisationDTO, String date_seisme) {
        this.id = id;
        this.nom = nom;
        this.magnitude = magnitude;
        this.localisationDTO = localisationDTO;
        this.date_seisme = date_seisme;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public LocalisationDTO getLocalisationDTO() {
        return localisationDTO;
    }

    public void setLocalisationDTO(LocalisationDTO localisationDTO) {
        this.localisationDTO = localisationDTO;
    }

    public String getDate_seisme() {
        return date_seisme;
    }

    public void setDate_seisme(String date_seisme) {
        this.date_seisme = date_seisme;
    }
}

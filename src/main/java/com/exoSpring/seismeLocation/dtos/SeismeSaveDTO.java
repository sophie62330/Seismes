package com.exoSpring.seismeLocation.dtos;

import com.exoSpring.seismeLocation.dtos.localisations.LocalisationDTO;

public class SeismeSaveDTO {
    private String nom;

    private String magnitude;

    private LocalisationRelationDTO localisationRelationDTO;

    private String date_seisme;

    public SeismeSaveDTO(String nom, String magnitude, LocalisationRelationDTO localisationRelationDTO, String date_seisme) {
        this.nom = nom;
        this.magnitude = magnitude;
        this.localisationRelationDTO = localisationRelationDTO;
        this.date_seisme = date_seisme;
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


    public String getDate_seisme() {
        return date_seisme;
    }

    public void setDate_seisme(String date_seisme) {
        this.date_seisme = date_seisme;
    }

    public LocalisationRelationDTO getLocalisationRelationDTO() {
        return localisationRelationDTO;
    }

    public void setLocalisationRelationDTO(LocalisationRelationDTO localisationRelationDTO) {
        this.localisationRelationDTO = localisationRelationDTO;
    }
}

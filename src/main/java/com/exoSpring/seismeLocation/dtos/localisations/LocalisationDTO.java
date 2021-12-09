package com.exoSpring.seismeLocation.dtos.localisations;

import com.exoSpring.seismeLocation.dtos.SeismeDTO;

import java.util.List;

public class LocalisationDTO {
    private String id;

    private String nom;

    private String code;

    private List<SeismeDTO> seismes;

    public LocalisationDTO(String id, String nom, String code, List<SeismeDTO> seismes) {
        this.id = id;
        this.nom = nom;
        this.code = code;
        this.seismes = seismes;
    }

    public List<SeismeDTO> getSeismes() {
        return seismes;
    }

    public void setSeismes(List<SeismeDTO> seismes) {
        this.seismes = seismes;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

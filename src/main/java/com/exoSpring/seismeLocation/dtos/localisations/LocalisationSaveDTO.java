package com.exoSpring.seismeLocation.dtos.localisations;

import com.exoSpring.seismeLocation.dtos.SeismeDTO;

import java.util.List;

public class LocalisationSaveDTO {
    private String id;

    private String nom;

    private String code;



    public LocalisationSaveDTO(String id, String nom, String code) {
        this.id = id;
        this.nom = nom;
        this.code = code;
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

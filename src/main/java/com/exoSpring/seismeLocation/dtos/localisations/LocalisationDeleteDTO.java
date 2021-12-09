package com.exoSpring.seismeLocation.dtos.localisations;

public class LocalisationDeleteDTO {
    private String id;

    public LocalisationDeleteDTO(){}

    public LocalisationDeleteDTO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

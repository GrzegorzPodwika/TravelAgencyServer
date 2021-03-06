package com.example.TravelAgencyServer.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Attraction {
    @Id
    @GeneratedValue
    private Integer attractionId;

    private String name;
    private String description;

    public Integer getAttractionId() {
        return attractionId;
    }

    public void setAttractionId(Integer attractionId) {
        this.attractionId = attractionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

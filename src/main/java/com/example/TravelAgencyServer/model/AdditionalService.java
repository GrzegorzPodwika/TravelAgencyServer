package com.example.TravelAgencyServer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AdditionalService {
    @Id
    @GeneratedValue
    private Integer additionalServiceId;

    private String name;
    private String description;

    public Integer getAdditionalServiceId() {
        return additionalServiceId;
    }

    public void setAdditionalServiceId(Integer additionalServiceId) {
        this.additionalServiceId = additionalServiceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}

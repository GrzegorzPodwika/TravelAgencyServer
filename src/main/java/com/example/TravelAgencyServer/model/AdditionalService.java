package com.example.TravelAgencyServer.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    public String getDescription() {
        return description;
    }

}

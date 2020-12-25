package com.example.TravelAgencyServer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Transport {
    @Id
    @GeneratedValue
    private Integer transportId;

    private String transportType;
    private double journeyTime;
    private String journeyDescription;

    @ManyToOne
    private Carrier carrier;

    public Integer getTransportId() {
        return transportId;
    }

    public void setTransportId(Integer transportId) {
        this.transportId = transportId;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public double getJourneyTime() {
        return journeyTime;
    }

    public void setJourneyTime(double journeyTime) {
        this.journeyTime = journeyTime;
    }

    public String getJourneyDescription() {
        return journeyDescription;
    }

    public void setJourneyDescription(String journeyDescription) {
        this.journeyDescription = journeyDescription;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }
}

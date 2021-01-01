package com.example.TravelAgencyServer.model;

import com.example.TravelAgencyServer.service.TourService;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

//TODO zmienic wszystkie z manytomany na onetomany z posredniczoca tabela

@Entity
public class Tour {
    @Id
    @GeneratedValue
    private Integer tourId;

    private String tourName;
    private String country;
    private int availableTickets;
    private int takenTickets;
    private double price;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate departureDate;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate arrivalDate;

    private String imgName;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private Hotel hotel;

    @OneToOne
    private Transport transport;

    @ManyToOne
    private TourGuide tourGuide;

    @ManyToMany(cascade = {
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    @JoinTable(name = "attraction_tour",
            joinColumns = @JoinColumn(name = "tour_id"),
            inverseJoinColumns = @JoinColumn(name = "attraction_id"))
    private Set<Attraction> attractions;

    @ManyToMany(cascade = {
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    @JoinTable(name = "additional_service_tour",
    joinColumns = @JoinColumn(name = "tour_id"),
    inverseJoinColumns = @JoinColumn(name = "additional_service_id"))
    private Set<AdditionalService> additionalServices;

    public Integer getTourId() {
        return tourId;
    }

    public void setTourId(Integer tourId) {
        this.tourId = tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public void setAvailableTickets(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public int getTakenTickets() {
        return takenTickets;
    }

    public void setTakenTickets(int takenTickets) {
        this.takenTickets = takenTickets;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public TourGuide getTourGuide() {
        return tourGuide;
    }

    public void setTourGuide(TourGuide tourGuide) {
        this.tourGuide = tourGuide;
    }

    public Set<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(Set<Attraction> attractions) {
        this.attractions = attractions;
    }

    public Set<AdditionalService> getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(Set<AdditionalService> additionalServices) {
        this.additionalServices = additionalServices;
    }

    public void addService(AdditionalService additionalService) {
        additionalServices.add(additionalService);
    }

    public void removeService(AdditionalService additionalService) {
        additionalServices.remove(additionalService);
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    public void removeAttraction(Attraction attraction) {
        attractions.remove(attraction);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "tourId=" + tourId +
                ", tourName='" + tourName + '\'' +
                ", country='" + country + '\'' +
                ", availableTickets=" + availableTickets +
                ", takenTickets=" + takenTickets +
                ", price=" + price +
                ", departureDate=" + departureDate +
                ", arrivalDate=" + arrivalDate +
                ", imgName='" + imgName + '\'' +
                ", employee=" + employee +
                ", hotel=" + hotel +
                ", transport=" + transport +
                ", tourGuide=" + tourGuide +
                '}';
    }
}

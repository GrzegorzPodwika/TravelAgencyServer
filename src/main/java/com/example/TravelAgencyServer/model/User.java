package com.example.TravelAgencyServer.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User extends Person{

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "user_reservation",
            joinColumns = @JoinColumn(name = "personId"),
            inverseJoinColumns = @JoinColumn(name = "reservationId"))
    private Set<Reservation> reservations = new HashSet<>();

    public User() {
    }

    public User(String nick, String password, String name, String surname, int age, String address, String city, String zipcode, String phoneNumber, String email) {
        this.nick = nick;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.city = city;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
        reservation.getUsers().add(this);
    }

    public void removeReservation(Reservation reservation) {
        reservations.remove(reservation);
        reservation.getUsers().remove(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

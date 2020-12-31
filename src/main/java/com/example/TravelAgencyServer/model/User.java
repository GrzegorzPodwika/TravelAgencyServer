package com.example.TravelAgencyServer.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User extends Person{

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

package com.example.TravelAgencyServer.model;

import javax.persistence.Entity;

@Entity
public class Employee extends Person{
    private double numberOfWorkedHours;
    private double hourlyRate;
    private double bonus;

    public Employee() {

    }

    public Employee(String nick, String password, String name, String surname,
                    int age, String address, String city, String zipcode, String phoneNumber, String email,
                    double numberOfWorkedHours, double hourlyRate, double bonus) {
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
        this.numberOfWorkedHours = numberOfWorkedHours;
        this.hourlyRate = hourlyRate;
        this.bonus = bonus;
    }

    public double getNumberOfWorkedHours() {
        return numberOfWorkedHours;
    }

    public void setNumberOfWorkedHours(double numberOfWorkedHours) {
        this.numberOfWorkedHours = numberOfWorkedHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

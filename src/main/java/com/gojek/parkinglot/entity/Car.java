package com.gojek.parkinglot.entity;

import lombok.Data;

@Data
public class Car {

    private String registrationNumber;
    private String color;

    public Car(String registrationNumber, String color) {
        this.registrationNumber = registrationNumber;
        this.color = color;
    }

}

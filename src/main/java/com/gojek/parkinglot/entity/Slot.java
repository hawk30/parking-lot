package com.gojek.parkinglot.entity;

import lombok.Data;

@Data
public class Slot {

    private int id;

    public Slot(int id) {
        this.id = id;
    }

}

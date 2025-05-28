package com.kat.tasks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
    private String cityName;
    private String dateFounded;
    private List<Human> humans = new ArrayList<>();

    public City(String cityName, String dateFounded) {
        this.cityName = cityName;
        this.dateFounded = dateFounded;
        this.humans = new ArrayList<>();
    }
}
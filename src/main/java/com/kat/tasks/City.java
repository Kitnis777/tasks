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
    String cityName;
    String dateFounded;
    private List<Human> humans;

    public City(String cityName, String dateFounded) {
        this.cityName = cityName;
        this.dateFounded = dateFounded;
        this.humans = new ArrayList<>();
    }

    public void addHuman(Human human) {
        humans.add(human);
    }
}
package com.lohika.morning.ml.spark.driver.service.lyrics;

public enum Genre {

    Blues("Blues", 0D),
    Country("Country", 1D),
    Hiphop("Hiphop", 2D),
    Jazz("Jazz", 3D),
    Pop("Pop", 4D),
    Reggae("Reggae", 5D),
    Rock("Rock", 6D),

    UNKNOWN("Don\'t know :(", -1D);

    private final String name;
    private final Double value;

    Genre(final String name, final Double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Double getValue() {
        return value;
    }

}

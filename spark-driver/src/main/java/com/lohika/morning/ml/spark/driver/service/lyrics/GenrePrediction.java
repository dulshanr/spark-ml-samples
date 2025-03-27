package com.lohika.morning.ml.spark.driver.service.lyrics;

public class GenrePrediction {

    private String genre;
    private Double blueProbability;
    private Double countryProbability;

    private Double hipPopProbability;

    private Double jazzProbability;

    private Double reggaeProbability;

    private Double popProbability;

    private Double rockProbability;

    public GenrePrediction(String genre, Double blueProbability, Double countryProbability, Double hipPopProbability, Double jazzProbability, Double reggaeProbability, Double popProbability, Double rockProbability) {
        this.genre = genre;
        this.blueProbability = blueProbability;
        this.countryProbability = countryProbability;
        this.hipPopProbability = hipPopProbability;
        this.jazzProbability = jazzProbability;
        this.reggaeProbability = reggaeProbability;
        this.popProbability = popProbability;
        this.rockProbability = rockProbability;
    }

    public GenrePrediction(String genre) {
        this.genre = genre;
    }

    public Double getBlueProbability() {
        return blueProbability;
    }

    public Double getCountryProbability() {
        return countryProbability;
    }

    public Double getHipPopProbability() {
        return hipPopProbability;
    }

    public Double getJazzProbability() {
        return jazzProbability;
    }

    public Double getReggaeProbability() {
        return reggaeProbability;
    }

    public Double getPopProbability() {
        return popProbability;
    }

    public Double getRockProbability() {
        return rockProbability;
    }

    public String getGenre() {
        return genre;
    }




}

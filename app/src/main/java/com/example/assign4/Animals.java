package com.example.assign4;

public class Animals {
    private String animalName;
    private String animalDescription;

    public Animals(String animalName, String animalDescription) {
        this.animalName = animalName;
        this.animalDescription = animalDescription;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalDescription() {
        return animalDescription;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalDescription(String animalDescription) { this.animalDescription = animalDescription; }
}

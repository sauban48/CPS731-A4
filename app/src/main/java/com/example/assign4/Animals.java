package com.example.assign4;

public class Animals {
    private String animalName;
    private String animalDescription;
    private String animalImage;

    public Animals(String animalName, String animalDescription, String animalImage) {
        this.animalName = animalName;
        this.animalDescription = animalDescription;
        this.animalImage = animalImage;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalDescription() { return animalDescription; }

    public String getImgURL() { return animalDescription; }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalDescription(String animalDescription) { this.animalDescription = animalDescription; }
}

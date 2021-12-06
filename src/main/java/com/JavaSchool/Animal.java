package com.JavaSchool;

public abstract class Animal {

    final private String animalNickname;
    final private String animalDateOfBirth;

    public String habitat;
    public String food;
    public int weight;
    public int area;

    protected Animal(String name, String date, String animalHabitat, String animalFood, int animalWeight, int animalArea) {
        this.animalNickname = name;
        this.animalDateOfBirth = date;
        this.habitat = animalHabitat;
        this.food = animalFood;
        this.weight = animalWeight;
        this.area = animalArea;
    }

    public String getAnimalNickname() {
        return animalNickname;
    }

    public String getAnimalDateOfBirth() {
        return animalDateOfBirth;
    }

    public abstract String getAnimalName();

    public abstract String getAnimalType();

    public abstract void getFoodForAnimal(String food1);
}


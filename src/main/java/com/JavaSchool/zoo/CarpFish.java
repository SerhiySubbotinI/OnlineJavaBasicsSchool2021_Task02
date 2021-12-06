package com.JavaSchool.zoo;

import com.JavaSchool.Animal;

public class CarpFish extends Animal {

    public CarpFish(String animalNickname, String animalDateOfBirth, String habitat, String food, int weight, int area) {
        super(animalNickname, animalDateOfBirth, habitat, food, weight, area);
    }

    public void getFoodForAnimal(String food) {
        switch (food) {
            case "Meat":
            case "Plants":
            case "Grass":
            case "Algae and Insects":
                System.out.println("I will eat: " + food);
                break;
            default:
                System.out.println("I will not eat: " + food);
                break;
        }
    }

    @Override
    public String getAnimalType() {
        return "Omnivores";
    }

    @Override
    public String getAnimalName() {
        return "Carp";
    }

}

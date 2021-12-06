package com.JavaSchool.zoo;

import com.JavaSchool.Animal;

public class TaranFish extends Animal {

    public TaranFish(String animalNickname, String animalDateOfBirth, String habitat, String food, int weight, int area) {
        super(animalNickname, animalDateOfBirth, habitat, food, weight, area);
    }

    public void getFoodForAnimal(String food) {
        switch (food) {
            case "Meat":
            case "Mollusks and Crustaceans":
                System.out.println("I will eat: " + food);
                break;
            default:
                System.out.println("I will not eat: " + food);
                break;
        }
    }

    @Override
    public String getAnimalType() {
        return "Carnivorous";
    }

    @Override
    public String getAnimalName() {
        return "Taran";
    }

}

package com.JavaSchool.zoo;

import com.JavaSchool.Animal;
import com.JavaSchool.AnimalEnum;

public class Coon extends Animal {

    public Coon(String animalNickname, String animalDateOfBirth, String habitat, String food, int weight, int area) {
        super(animalNickname, animalDateOfBirth, habitat, food, weight, area);
    }

    public void getFoodForAnimal(String food) {
        if (food.equals(AnimalEnum.COON.getTypeOfFood()))
            System.out.println("I will eat: " + food);
        else System.out.println("I will not eat: " + food);
    }

    @Override
    public String getAnimalType() {
        return "Carnivorous";
    }

    @Override
    public String getAnimalName() {
        return "Coon";
    }


}

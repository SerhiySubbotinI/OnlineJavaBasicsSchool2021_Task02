package com.JavaSchool.zoo;

import com.JavaSchool.Animal;
import com.JavaSchool.AnimalEnum;

public class Kangaroo extends Animal {

    public Kangaroo(String animalNickname, String animalDateOfBirth, String habitat, String food, int weight, int area) {
        super(animalNickname, animalDateOfBirth, habitat, food, weight, area);
    }

    public void getFoodForAnimal(String food) {
        if (food.equals(AnimalEnum.KANGAROO.getTypeOfFood()) || food.equals("Grass"))
            System.out.println("I will eat: " + food);
        else System.out.println("I will not eat: " + food);
    }

    @Override
    public String getAnimalType() {
        return "Herbivores";
    }

    @Override
    public String getAnimalName() {
        return "Kangaroo";
    }


}

package com.JavaSchool.zoo;

import com.JavaSchool.Animal;
import com.JavaSchool.AnimalEnum;

public class Lynx extends Animal {

    public Lynx(String animalNickname, String animalDateOfBirth, String habitat, String food, int weight, int area) {
        super(animalNickname, animalDateOfBirth, habitat, food, weight, area);
    }

    public void getFoodForAnimal(String food) {
        if (food.equals(AnimalEnum.LYNX.getTypeOfFood()))
            System.out.println("I will eat: " + food);
        else System.out.println("I will not eat: " + food);
    }

    @Override
    public String getAnimalType() {
        return "Carnivorous";
    }

    @Override
    public String getAnimalName() {
        return "Lynx";
    }

//    private String habitat;
//    private String food;
//    private int weight;
//    private int area;

//    public Lynx(String animalNickname, String animalDateOfBirth, String habitat, String food, int weight, int area) {
//        super(animalNickname, animalDateOfBirth);
//        this.habitat = habitat;
//        this.food = food;
//        this.weight = weight;
//        this.area = area;
//    }

//    public String getHabitat(){
//        return habitat;
//    }

//    public String getFood(){
//        return food;
//    }

//    public int getWeight() {
//        return weight;
//    }

//    public int getArea() {
//        return area;
//    }
}

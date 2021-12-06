package com.JavaSchool;

import com.JavaSchool.zoo.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        task01();
        task02();
        OptimalTask();
    }

    public static void task01() {
        //TODO Task01
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Lynx("Diaz", "01-Nov-2019", AnimalEnum.LYNX.getHabitat(),
                AnimalEnum.LYNX.getTypeOfFood(), AnimalEnum.KANGAROO.getWeight(), AnimalEnum.LYNX.getArea()));
        animalList.add(new Coon("Max", "02-Nov-2019", AnimalEnum.COON.getHabitat(),
                AnimalEnum.COON.getTypeOfFood(), AnimalEnum.CARPFISH.getWeight(), AnimalEnum.CARPFISH.getArea()));
        animalList.add(new Kangaroo("Lucky", "03-Nov-2019", AnimalEnum.KANGAROO.getHabitat(),
                AnimalEnum.KANGAROO.getTypeOfFood(), AnimalEnum.KANGAROO.getWeight(), AnimalEnum.KANGAROO.getArea()));
        animalList.add(new EagleBird("While", "04-Nov-2019", AnimalEnum.EAGLEBIRD.getHabitat(),
                AnimalEnum.EAGLEBIRD.getTypeOfFood(), AnimalEnum.EAGLEBIRD.getWeight(), AnimalEnum.EAGLEBIRD.getArea()));
        animalList.add(new OstrichBird("King", "05-Nov-2019", AnimalEnum.OSTRICHBIRD.getHabitat(),
                AnimalEnum.OSTRICHBIRD.getTypeOfFood(), AnimalEnum.OSTRICHBIRD.getWeight(), AnimalEnum.OSTRICHBIRD.getArea()));
        animalList.add(new CarpFish("Rich", "06-Nov-2019", AnimalEnum.CARPFISH.getHabitat(),
                AnimalEnum.CARPFISH.getTypeOfFood(), AnimalEnum.CARPFISH.getWeight(), AnimalEnum.CARPFISH.getArea()));
        animalList.add(new TaranFish("Thunder", "07-Nov-2019", AnimalEnum.TARANFISH.getHabitat(),
                AnimalEnum.TARANFISH.getTypeOfFood(), AnimalEnum.TARANFISH.getWeight(), AnimalEnum.TARANFISH.getArea()));
        Iterator<Animal> itr = animalList.iterator();

        System.out.printf("Task01:\n%-15s %-15s %-15s %-30s %-25s %-10s %-5s\n", "Animal", "Nickname", "Date Of Birth", "Habitat",
                "Food type", "Max weight(kg)", "Habitat area(s.m.)");
        while (itr.hasNext()) {
            Animal an = itr.next();
            System.out.printf("%-15s %-15s %-15s %-30s %-30s %-15d %-5d\n", an.getAnimalName(), an.getAnimalNickname(),
                    an.getAnimalDateOfBirth(), an.habitat, an.food, an.weight, an.area);
        }
        String food1 = "Meat";
        String food2 = "Grass";
        animalList.forEach(animal -> {
            System.out.println("Animal: " + animal.getAnimalName() + ", (" + animal.getAnimalType()
                    + "), nickname: " + animal.getAnimalNickname());
            animal.getFoodForAnimal(food1);
            animal.getFoodForAnimal(food2);
        });
    }
    //TODO Task02
    public static void task02() {
        int result02 = 5 * AnimalEnum.LYNX.getArea() + 4 * AnimalEnum.COON.getArea() + 2 * AnimalEnum.KANGAROO.getArea()
                + 7 * AnimalEnum.EAGLEBIRD.getArea() + 3 * AnimalEnum.OSTRICHBIRD.getArea()
                + 15 * AnimalEnum.CARPFISH.getArea() + 7 * AnimalEnum.TARANFISH.getArea();
        System.out.println("\nTask02:\nCalculation of the minimum required area for zoo: " + result02 + " (sq.m.)");
    }
    //TODO OptimalTask
    public static void OptimalTask() {
        int resultLandAnimal = 5 * AnimalEnum.LYNX.getWeight() + 4 * AnimalEnum.COON.getWeight()
                + 2 * AnimalEnum.KANGAROO.getWeight() + 3 * AnimalEnum.OSTRICHBIRD.getWeight();
        int resultFlyAnimal = 7 * AnimalEnum.EAGLEBIRD.getWeight();
        int resultWaterAnimal = 15 * AnimalEnum.CARPFISH.getWeight() + 7 * AnimalEnum.TARANFISH.getWeight();
        System.out.println("\nOptimalTask:\nVehicle capacity for land animals: " + resultLandAnimal + " (kg)");
        System.out.println("Vehicle capacity for flying animals: " + resultFlyAnimal + " (kg)");
        System.out.println("Vehicle capacity for water animals :" + resultWaterAnimal + " (kg)");
    }
}




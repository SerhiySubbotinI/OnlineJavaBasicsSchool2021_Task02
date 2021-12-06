package com.JavaSchool;

public enum AnimalEnum {
    LYNX("Animal lives on the ground", "Meat", 30, 200),
    COON("Animal lives on the ground", "Meat", 9, 50),
    KANGAROO("Animal lives on the ground", "Plants", 85, 300),
    EAGLEBIRD("Flying animal", "Meat", 7, 100),
    OSTRICHBIRD("Animal lives on the ground", "Plants", 140, 150),
    CARPFISH("Animal lives in water", "Algae and Insects", 4, 8),
    TARANFISH("Animal lives in water", "Mollusks and Crustaceans", 2, 5);

    final private String habitat;
    final private String typeOfFood;
    final private int weight;
    final private int area;

    AnimalEnum(String habitat, String typeOfFood, int weight, int area) {
        this.habitat = habitat;
        this.typeOfFood = typeOfFood;
        this.weight = weight;
        this.area = area;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public int getWeight() {
        return weight;
    }

    public int getArea() {
        return area;
    }

}


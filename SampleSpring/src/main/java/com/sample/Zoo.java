package com.sample;

public class Zoo {
    private String name;

    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Zoo(Animal animal) {
        this.animal = animal;
    }
    //    private Tiger tiger;
//
//    public Tiger getTiger() {
//        return tiger;
//    }
//
//    public void setTiger(Tiger tiger) {
//        this.tiger = tiger;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println("Zoo class display method excuted");
        animal.display();
    }
}

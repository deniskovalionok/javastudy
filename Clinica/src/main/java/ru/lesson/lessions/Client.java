package ru.lesson.lessions;

import java.util.ArrayList;

/**
 * Created by Den on 06.08.2015.
 */
public class Client {
    int id;
    String name;
    Pet pet;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public Client(String name, Pet pet){
        this.name = name;
        this.pet = pet;
    }


    public String toString() {
        return getName() + this.pet.getNamep();
    }

}

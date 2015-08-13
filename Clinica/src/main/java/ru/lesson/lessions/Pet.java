package ru.lesson.lessions;

import java.util.ArrayList;
/**
 * Created by Den on 06.08.2015.
 */
public class Pet {
   public  String namep;
    int ago;
    int weight;

    public Pet(String namep, int ago, int weight) {
        this.ago = ago;
        this.namep = namep;
        this.weight = weight;
    }

    public String getNamep() {
        return this.namep;
    }

    public void setNamep(String namep) {
        this.namep = namep;
    }
}

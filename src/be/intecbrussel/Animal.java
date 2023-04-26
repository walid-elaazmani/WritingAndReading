package be.intecbrussel;

import java.io.Serializable;

public class Animal implements Serializable {

    String name;

    boolean edible;

    public Animal(String name, boolean edible) {
        this.name = name;
        this.edible = edible;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", edible=" + edible +
                '}';
    }
}

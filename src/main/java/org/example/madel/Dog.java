package org.example.madel;

public class Dog implements Animal {
    private String name;
    @Override
    public void animamlPlus() {
        System.out.println("storojit dom");
    }

    @Override
    public void animalMinus() {
        System.out.println("mojet ukist");
    }

    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}

package org.example.madel;

public class House implements Animal{
    private String name;
    @Override
    public void animamlPlus() {
        System.out.println("at adamdyn kanaty");
    }

    @Override
    public void animalMinus() {
        System.out.println("minusu jok");
    }

    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                '}';
    }
}

package Tema1;//2.	Create a class Tema1.Dog that extends class Tema1.Animal

public class Dog extends Animal {
    //2.a.	Add private field color
    private String color;

    //2.b.	Write a constructor with parameters
    public Dog(String color, Integer age, Integer numberOfLegs, Boolean vegetarian) {
        super(age, numberOfLegs, vegetarian);
        this.color = color;

    }

    //2.c.	Write getters and setters
    public void setVegetarian(Boolean vegetarian) {
        super.setVegetarian(vegetarian);
    }

    public void setNumberOfLegs(Integer numberOfLegs) {
        super.setNumberOfLegs(numberOfLegs);
    }

    public void setAge(Integer age) {
        super.setAge(age);
    }

    public Integer getNumberOfLegs() {
        return super.getNumberOfLegs();
    }

    public Boolean getVegetarian() {
        return super.getVegetarian();
    }

    public Integer getAge() {
        return super.getAge();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    //4.	Create a new public method named "bark" in class Tema1.Dog
    public void bark() {
        System.out.println("Bark!!!");

    }

    //6.	Override toString() method in class Tema1.Dog. In this implementation call the parent implementation.
    @Override
    public String toString() {
        return super.toString() + "color " + color;
    }


}

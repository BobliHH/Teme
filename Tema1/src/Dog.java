//2.	Create a class Dog that extends class Animal

public class Dog extends Animal {
    //2.a.	Add private field color
    private String color;

    //2.b.	Write a constructor with parameters
    public Dog(String color, Integer age, Integer numberOfLegs, Boolean vegetarian) {
        super(age, numberOfLegs, vegetarian);
        this.color = color;

    }

    //2.c.	Write getters and setters

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    //4.	Create a new public method named "bark" in class Dog
    public void bark() {
        System.out.println("Bark!!!");

    }

    //6.	Override toString() method in class Dog. In this implementation call the parent implementation.
    @Override
    public String toString() {
        return super.toString() + "color " + color;
    }


}

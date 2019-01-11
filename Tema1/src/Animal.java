//1.	Create a class Animal with the following fields: age, numberOfLegs, vegetarian.
public class Animal {
    private Integer age;
    private Integer numberOfLegs;
    private Boolean vegetarian;
//1. a.	Write a constructor with parameters
    public Animal(Integer age, Integer numberOfLegs, Boolean vegetarian) {
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.vegetarian = vegetarian;
    }
//1.b.	Write getters and setters
    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void setNumberOfLegs(Integer numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getVegetarian() {
        return vegetarian;
    }

//1.c.	Write a method called eat that will print the message "Animal is eating".
    public void eat(){
        System.out.println("Animal is eating.");
    }

//5.	Override toString() method in class Animal
    @Override
    public String toString(){
        return age.toString()+numberOfLegs.toString()+vegetarian.toString();
    }





}

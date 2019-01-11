public class Main {
    public static void main(String[] args) {
    //1.d.	Instantiate an Animal object and print using getters
        Animal animal = new Animal(5, 4, false);
        System.out.println(animal.getClass());

    //2.d.	Instantiate a Dog object and print using getters
        Dog dog1 = new Dog("Black", 5, 4, false);
        System.out.println(dog1);

    //3.	Instantiate a Dog object and assign it to an Animal instance.
        Animal dog2 = new Dog("White", 4, 4, false);

    //4.a.	Call the method using the dog object
        dog1.bark();

    //4.b.	Call the method using the animal object
        ((Dog) dog2).bark();

    //7.	Instantiate 2 objects Animal and Dog and assign it to an Animal instance.
        Animal animal2 = new Animal(7, 4, true);
        Animal dogx = new Dog("White", 10, 4, false);

    //7.a.  Call toString() method for both objects.
        animal2.toString();
        dogx.toString();
     //8.a.	Call the method by passing an animal object
        Main.displayAnimalCharacteristics(animal2);
    // 8.b.	Call the method by passing a dog object
        Main.displayAnimalCharacteristics(dogx);
    }
    //8.	In the Main class create a method that receives an Animal object and print the details of that object.

    public static void displayAnimalCharacteristics(Animal animal){
        System.out.println(animal);


    }

}

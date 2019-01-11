public class Truck extends Vehicle {

    public void printState(Integer value) {
        Truck truck = new Truck();
        truck.changeGear(2);
        truck.applyBrakes(1);
        truck.printState(2);

    }
}

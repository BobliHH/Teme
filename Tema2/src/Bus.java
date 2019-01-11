public class Bus extends Vehicle {

    public void printState(Integer value) {
        Bus bus = new Bus();
        bus.changeGear(1);
        bus.speedUp(4);
        bus.applyBrakes(3);
        bus.printState(5);

    }
}

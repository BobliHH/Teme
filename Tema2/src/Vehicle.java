public abstract class Vehicle {
    //2.	Creaza o clasa abstracta Vehicle care are urmatorii membrii private:
    //-	Int speed: viteza cu care se deplaseaza vehiculul
    //-	Int gear: treapta de viteza
    private Integer speed;
    private Integer gear;

    //Clasa are urmatoarele metode:
    //-	Void changeGear(int newGear): metoda ce seteaza membrul privat gear cu parametrul primit  ce reprezinta noua treapta de viteza a vehiculului
    void changeGear(int newGear) {

        this.gear = newGear;

    }
    //Void speedUp(int increment): metoda ce aduca parametrul primit de metoda la viteza curenta a vehiculului

    void speedUp(int increment) {
        this.speed = speed + increment;

    }

    //Void applyBrakes(int decrement): metoda ce scade viteza vehiculului cu valoarea primita prin parametrul metodel

    void applyBrakes(int decrement) {
        this.speed = speed - decrement;
    }
    //Clasa are o metoda abstracta:
    //-	Void printState(): metoda care afiseaza starea obiectului

    public abstract void printState(Integer value);

}

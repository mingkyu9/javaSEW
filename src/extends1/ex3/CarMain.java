package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();
        GassCar gasCar = new GassCar();
        gasCar.move();
        gasCar.fillup();
        gasCar.openDoor();

        HydrogenCar hydrogenCar=new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
    }
}
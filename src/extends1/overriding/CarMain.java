package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GassCar gasCar = new GassCar();
        gasCar.move();

    }
}
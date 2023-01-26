public class Drive {

    public static void main(String[] args) {
        Car car = new Car(0, 0);
        Bicycle bicycle = new Bicycle(0, 0);
        accelerate(car, 25);
        accelerate(bicycle, 7);
        System.out.println("Speed car: " + car.getCurrentSpeed());
        System.out.println("Speed bicycle: " + bicycle.getCurrentSpeed());
    }

    public static void accelerate(Vehicle vehicle, int speed) {
        vehicle.accelerate(speed);
    }
}

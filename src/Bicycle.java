public class Bicycle implements Vehicle {
    private int currentGear;
    private int currentSpeed;
    public static final int NUMBER_OF_WHEELS = 2;

    @Override
    public void accelerate(int speed) {
        currentSpeed += speed;
    }

    @Override
    public void upGear() {
        if (currentGear < 21) {
            currentGear++;
        }
    }

    @Override
    public void downGear() {
        if (currentGear < 6) {
            currentGear++;
        }
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Bicycle(int currentGear, int currentSpeed) {
        this.currentGear = currentGear;
        this.currentSpeed = currentSpeed;
    }
}

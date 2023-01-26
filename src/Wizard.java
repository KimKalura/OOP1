public class Wizard extends PlayerCharacter implements Playable {
    private int power;

    public Wizard(String name, int age, int currentLevelUp, int power) {
        super(name, age, currentLevelUp);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void attack() {
        System.out.println("Attacking with power: " + power);
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "power=" + power +
                '}';
    }

    @Override
    public void levelUp() {
    int level = getCurrentLevelUp() + 1;
    setCurrentLevelUp(level);
    power+=50;
    }
}

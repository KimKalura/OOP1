public abstract class PlayerCharacter {
    private String name;
    private int age;
    private int currentLevelUp;

    public PlayerCharacter(String name, int age, int currentLevelUp) {
        this.name = name;
        this.age = age;
        this.currentLevelUp = currentLevelUp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCurrentLevelUp() {
        return currentLevelUp;
    }

    public void setCurrentLevelUp(int currentLevelUp) {
        this.currentLevelUp = currentLevelUp;
    }

    public void run() {
        System.out.println("Player is running.");
    }

    public void speak() {System.out.println("My name is " + this.name + " and I am " + this.age + ".");}

    public abstract void attack();

}

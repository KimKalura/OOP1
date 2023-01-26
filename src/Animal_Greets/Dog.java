package Animal_Greets;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("This is " + getName() + " - Woof!");
    }
    public void greets(Dog anotherDog) {
        System.out.println("- Woof, woof!" + anotherDog.getName());
    }

}


package Animal_Greets;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("This is " + getName() + ". - Meow!");
    }


}
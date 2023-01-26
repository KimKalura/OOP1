package Animal_Greets;

public class SecurityDog extends Dog{

    public SecurityDog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("- Woow!");
    }

    public void greets(Dog anotherDog) {
        System.out.println("- Woow, woow!" + anotherDog.getName());
    }
}

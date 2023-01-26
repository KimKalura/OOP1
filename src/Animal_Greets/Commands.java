package Animal_Greets;

import java.util.Scanner;

public class Commands {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Simba");
        cat1.greets();
        Dog dog1 = new Dog("Tomy");
        dog1.greets();

        Dog anotherDog3 = new Dog("Mika");
        anotherDog3.greets(dog1);

        SecurityDog securityDog1 = new SecurityDog("Nero");
        securityDog1.greets();

        SecurityDog securityDog2 = new SecurityDog("Rudy");
        securityDog2.greets(dog1);


        Animal animal;


//        Scanner s = new Scanner(System.in);
//        String type = s.next();
//        if (type.equals("dog")) {
//            animal = new Dog("Azor");
//        }
//        else{
//            animal = new Cat ("Pisi");
//        }
//        animal.greets();
    }
}

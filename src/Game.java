public class Game {
    public static void main(String[] args) {
        //incapsulare
//        PlayerCharacter player1= new PlayerCharacter("Kim", 177);
//        player1.speak();
//
//        System.out.println(player1.getName());
//        player1.setName("Oli");
//        System.out.println(player1.getName());

        Archer archer1 = new Archer("Adam", 145, 1, 100);
        archer1.speak();
        System.out.println(archer1.getName());
        Wizard wizard1 = new Wizard("Merlin", 356, 1, 5);
        wizard1.speak();

        System.out.println(wizard1 instanceof PlayerCharacter);
        System.out.println(wizard1 instanceof Wizard);
        System.out.println(wizard1 instanceof Object);

        archer1.attack();  System.out.println(wizard1 instanceof Object);
        wizard1.attack();

        System.out.println(" ");

        playerAttack(archer1);
        playerAttack(wizard1);


        System.out.println(wizard1.toString());

        archer1.levelUp();
        wizard1.levelUp();
        System.out.println(archer1.getCurrentLevelUp());
        System.out.println(wizard1.getCurrentLevelUp());

    }
    public static void playerAttack(PlayerCharacter playerCharacter) {
        playerCharacter.attack();
    }

//    public static void init_Attacks(PlayerCharacter[] characters){
//        for (int i = 0 ; i<characters.length; i++){
//            characters[i].attack();
//        }
//    }
}

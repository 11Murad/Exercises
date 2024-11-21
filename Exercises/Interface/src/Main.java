public class Main {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck("Çiçək");
        RubberDuck rubber = new RubberDuck("Məkmək");
        DecoyDuck decoy = new DecoyDuck("Deki");

        System.out.println("Mallard Duck:");
        mallard.display();
        mallard.swim();
        mallard.fly();
        mallard.quack();

        System.out.println();

        System.out.println("Rubber Duck:");
        rubber.display();
        rubber.swim();
        rubber.quack();

        System.out.println();

        System.out.println("Decoy Duck:");
        decoy.display();
        decoy.swim(); 
    }
}
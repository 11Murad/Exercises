public class RedheadDuck extends Duck implements Flyable, Quackable {
    RedheadDuck(String name) {
        super(name);
    }
//    @Override
//    void display() {
//        System.out.println("I'm a RedheadDuck Duck");
//    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void quack() {
        System.out.println("Cruack!");
    }
}

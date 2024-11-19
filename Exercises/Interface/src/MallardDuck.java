public class MallardDuck extends Duck implements Quackable, Flyable {

    MallardDuck(String name) {
        super(name);
    }

//    @Override
//    void display() {
//        System.out.println("I'm a Mallard Duck");
//    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}

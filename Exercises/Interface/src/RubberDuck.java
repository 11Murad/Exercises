public class RubberDuck extends Duck implements Quackable {

    RubberDuck(String name) {
        super(name);
    }

//    @Override
//    void display() {
//        System.out.println("I'm a Rubber Duck");
//    }

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}

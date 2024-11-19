public class Main {
    public static void main(String[] args) {
        String[] habits = new String[]{
                "sleeping", "playing with ball", "to bark"};
        Human mother = new Human("Zendaya","Kisixanova",1980);

        Human father = new Human("Mudrik","Kisixanov",1975);

        Human child = new Human("John","Kisixanov",2005);

        Pet dog= new Pet("Dog","Toplan");
        dog.setTrickLevel(105);

        child.setMother(mother);
        child.setPet(dog);

        System.out.println(child.setPet(dog));

    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] habits = new String[]{
                "sleeping", "playing with ball", "to bark"};
        Human mother = new Human("Zendaya","Kisixanova",1980);

        Human father = new Human("Mudrik","Kisixanov",1975);

        Family family = new Family(mother,father);

        Human child1 = new Human("Alikram","Kisixanov",2005);
        Human child2 = new Human("Cahangest","Kisixanov",2000);

        family.addChild(child1);
        family.addChild(child2);
        family.deleteChild(1);
        System.out.println(Arrays.toString(family.getChildren()));
        System.out.println(family.counterFamily());

    }
}
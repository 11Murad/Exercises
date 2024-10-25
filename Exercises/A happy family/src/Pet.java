import java.util.Random;

public class Pet {
    public String species;
    public String nickName;
    public int age;
    public int trickLevel=trickLevel();
    public String[] habits;

    public Pet() {
    }

    public Pet(String species, String nickName){
        this.species = species;
        this.nickName = nickName;
    }

    public Pet(String species, String nickName, int age, int trickLevel, String[] habits){
        this.species = species;
        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

public void eat() {
    System.out.println("I am eating");
}

public void respond() {
    System.out.println("Hello, owner. I am " + nickName + ". I miss you!");
}

public void foul() {
    System.out.println("I need to cover it up");
}

public int trickLevel() {
        Random rand = new Random();
        return rand.nextInt(1,100);
}
}

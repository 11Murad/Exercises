import java.util.Arrays;
import java.util.Random;

public class Pet {
    static {
        System.out.println("Pet class was loaded");
    }
    {
        System.out.println("Object type Pet");
    }

    private Species species;
    private String nickName;
    private int age;
    private int trickLevel;
    private String[] habits;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        Validation.checkValidations(species);
        this.species = species;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        Validation.checkValidations(nickName);
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("invalid age");
        } else {
            this.age = age;
        }
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        if (trickLevel < 0 || trickLevel > 100) {
            System.out.println("invalid trick level");
        }
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public Pet() {
    }

    public Pet(String species, String nickName) {
        this.species = species;
        this.nickName = nickName;
    }

    public Pet(String species, String nickName, int age, int trickLevel, String[] habits) {
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

    public int generateTrickLevel() {
        Random rand = new Random();
        return rand.nextInt(1, 100);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}

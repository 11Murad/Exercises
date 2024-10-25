import java.util.Random;

public class Pet {
    private String species;
    private String nickName;
    private int age;
    private int trickLevel;
    private String[] habits;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if (species == null) {
            throw new RuntimeException("Null name:"+species);
        } else if (species.isBlank()) {
            throw new RuntimeException("Blank name:" + species);
        } else if (species.length() > 50) {
            throw new RuntimeException("Name too long:" + species);
        } else if (!species.matches("[a-zA-Z ]+")) {
            throw new RuntimeException("Invalid name format:" + species);
        }
        this.species = species;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        if (nickName == null) {
            throw new RuntimeException("Null name:"+nickName);
        } else if (nickName.isBlank()) {
            throw new RuntimeException("Blank name:" + nickName);
        } else if (nickName.length() > 50) {
            throw new RuntimeException("Name too long:" + nickName);
        } else if (!nickName.matches("[a-zA-Z ]+")) {
            throw new RuntimeException("Invalid name format:" + nickName);
        }
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("invalid age");
        }else {
        this.age = age;}
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        if (trickLevel < 0 && trickLevel > 100) {
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

public int generateTrickLevel() {
        Random rand = new Random();
        return rand.nextInt(1,100);
}
}

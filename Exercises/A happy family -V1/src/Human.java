public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new RuntimeException("Null name:"+name);
        } else if (name.isBlank()) {
            throw new RuntimeException("Blank name:" + name);
        } else if (name.length() > 50) {
            throw new RuntimeException("Name too long:" + name);
        } else if (!name.matches("[a-zA-Z ]+")) {
            throw new RuntimeException("Invalid name format:" + name);
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null) {
            throw new RuntimeException("Null name:"+surname);
        } else if (surname.isBlank()) {
            throw new RuntimeException("Blank name:" + surname);
        } else if (surname.length() > 50) {
            throw new RuntimeException("Name too long:" + surname);
        } else if (!surname.matches("[a-zA-Z ]+")) {
            throw new RuntimeException("Invalid name format:" + surname);
        }
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year<0 && year > 250) {
            System.out.println("Invalid year");
            return; 
        }
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this(name, surname, year);
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this(name, surname, year, father, mother);
        this.iq = iq;
        this.pet = pet;
        this.schedule = schedule;
    }

    public Human() {
    }

    public void greetPet() {
        System.out.println("Hello," + pet.getNickName());
    }

    public void describePet() {
        String slyness = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
        System.out.println("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is " + slyness);

    }
}

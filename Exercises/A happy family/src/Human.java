public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;
    public Pet pet;
    public Human mother;
    public Human father;
    public String[][] schedule;

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
        System.out.println("Hello," + pet.nickName);
    }

    public void describePet() {
        String slyness = pet.trickLevel > 50 ? "very sly" : "almost not sly";
        System.out.println("I have a " + pet.species + ", he is " + pet.age + " years old, he is " + slyness);

    }
}

import java.util.Arrays;

public class Human {
    static {
        System.out.println("Human class was loaded");
    }
    {
        System.out.println("Object type Human");
    }

    private String name;
    private String surname;
    private int year;
    private int iq;
    private DayOfWeek[][] DayOfWeek;
    private Family family;
    private Pet pet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Validation.checkValidations(name);
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        Validation.checkValidations(surname);
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0 || year > 250) {
            System.out.println("Invalid year");
            return;
        }
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        if (iq < 0 || iq > 250) {
            System.out.println("Invalid year");
            return;
        }
        this.iq = iq;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public DayOfWeek[][] getSchedule() {
        return DayOfWeek;
    }

    public void setSchedule(DayOfWeek[][] DayofWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, DayOfWeek[][] schedule) {
        this(name, surname, year);
        this.iq=iq;
        this.DayOfWeek=schedule;
    }

    public Human(String name, String surname, int year, int iq,DayOfWeek[][] schedule,
                 Pet pets) {
        this(name, surname, year);
        this.iq = iq;
        this.pet = pets;
        this.DayOfWeek = schedule;
    }

    public Human() {
    }

    public void greetPet() {
        if (pet != null) {
            System.out.println("Hello, " + pet.getNickName());
        }
    }

    public void describePet() {
        if (pet != null) {
            String slyness = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
            System.out.println("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is " + slyness);
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.toString(DayOfWeek) +
                ", family=" + family +
                ", pet=" + pet +
                '}';
    }
}

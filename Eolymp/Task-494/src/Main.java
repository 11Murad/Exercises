public class Main {
    public static void main(String[] args) {
        Student student = new Student()
                .setAge(18)
                .setName("Alixan")
                .setSurname("Racabov");
        print(student);
    }

    public static void print(Student s) {
        System.out.println(s);
    }
}


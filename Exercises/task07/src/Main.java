import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Department department1 = new Department();
        department1.name = "Psychology";

        Student [] students2 = new Student[2];
        Student[] students1 = new Student[1];
        
        Professor professor1 = new Professor();
        professor1.fullName = "Sigmund Freud";
        professor1.email = "sigmundfreud@gmail.com";
        professor1.birthDate = LocalDate.of(1965, 01, 31);
        professor1.department = department1;
        professor1.students = students2;

        Professor professor2 = new Professor();
        professor2.fullName = "Martin Seligman";
        professor2.email = "martinseligman@gmail.com";
        professor2.birthDate = LocalDate.of(1970, 5, 31);
        professor2.department = department1;
        professor2.students = students1;

        Course course1 = new Course();
        course1.name = "Ethics";
        course1.code = "ET";
        course1.department = department1;
        course1.professor= professor1;
        course1.students = students2;

        Course course2 = new Course();
        course2.name = "Social";
        course2.code = "Sc";
        course2.department = department1;
        course2.professor= professor2;
        course2.students = students1;

        Student student1 = new Student();
        student1.fullName = "Faiq Aghayev";
        student1.email = "faiqaghayev@gmail.com";
        student1.birthDate = LocalDate.of(1970,5,20);
        student1.department = department1;
        students2 [0] = student1;

        Student student2 = new Student();
        student2.fullName = "Tunzale Ibrahimova";
        student2.email = "tunzaleibrahimova@gmail.com";
        student2.birthDate = LocalDate.of(1979,7,20);
        student2.department = department1;
        students2 [1] = student2;

        Student student3 = new Student();
        student3.fullName = "Aygun Kazımova";
        student3.email = "aygunkazmova@gmail.com";
        student3.birthDate = LocalDate.of(1975,8,8);
        student3.department = department1;
        students1[0] = student3;

        System.out.println(professor1.students[0].department.name);

    }
}
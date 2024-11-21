public class Main {

    public static void main(String[] args) {
        Employee tim = new Employee("Tim","1985","01/01/2020");
        System.out.println("Age="+tim.getAge());
        System.out.println("Pay="+tim.collectPayment());

        SalariedEmployee Joe = new SalariedEmployee("Joe","1990","01/03/2020","35000");
        System.out.println(Joe);
        System.out.println("Joe's paycheck= $" + Joe.collectPayment());
    }




}
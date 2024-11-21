public class Employee extends Worker {

    private static int employeeNo = 1;
    private long employeeID;
    private String hireDate;

    public Employee(String name, String birthdate, String hireDate) {
        super(name, birthdate);
        this.employeeID = employeeNo++;
        this.hireDate = hireDate;
    }

    public String toString() {
        return "Employee{" + " Employee ID:" + employeeID + "\nHire Date: " + hireDate + "} " + super.toString();
    }

}

public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String Name, String birthdate, String hiredate, double hourlyPayRate) {
    super(Name, birthdate, hiredate);
    this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPayment() {
        return 40 * hourlyPayRate;
    }
    public double getDoublePay(){
        return 2 * collectPayment();
    }

}

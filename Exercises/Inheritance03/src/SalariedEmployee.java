public class SalariedEmployee extends Employee {
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name,String birthdate, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthdate, hireDate);
        this.annualSalary = annualSalary;
    }
    @Override
    public double collectPay(){
        double paycheck = annualSalary/26;
        double adjustedpay =(isRetired)? 0.9 * paycheck : paycheck;
        return (int)adjustedpay;
    }




}

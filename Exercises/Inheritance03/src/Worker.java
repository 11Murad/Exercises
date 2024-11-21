import java.time.LocalDate;

public class Worker {
    private String name;
    private String birthdate;
    protected String endDate;

    public Worker(){};
    public Worker(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public int getAge(){
        int currentYear= LocalDate.now().getYear();
        int birthYear= Integer.parseInt(birthdate);
        return (currentYear - birthYear);
    }

    public double collectPayment(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    public String toString(){
        return "Worker{"+"name=' "+ name +'\'' + ", birthdate='" + birthdate + '\''+", endDate='" + endDate + '\'' + '}';
    }




}

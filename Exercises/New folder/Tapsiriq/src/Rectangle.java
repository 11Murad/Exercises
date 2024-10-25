import java.util.Scanner;

public class Rectangle {
    public double length;
    public double width;

    public double area (double x, double y){
        System.out.println("Ölçüləri daxil edin:");
        Scanner sc = new Scanner(System.in);
         x = sc.nextDouble();
         y= sc.nextDouble();
         return x*y;
    }
    public double perimeter (double x, double y){
        return 2*(x+y);
    }
    public double area (double x){
        return x*x;
    }
}

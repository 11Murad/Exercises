import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            try {
                String str = sc.nextLine();
                Print print = new Print();
                print.printString(str);
            }

            catch (Exception e){
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
}
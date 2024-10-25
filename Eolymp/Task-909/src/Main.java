import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("Ment daxil edin(simvollarin sayi 250-ə qədər):");
            String input = scanner.nextLine();

            String[] words = input.trim().split(" ");
// murad eve gedir
            int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(" ")) {
                System.out.println(words[i]);
                }
            }
        }
    }


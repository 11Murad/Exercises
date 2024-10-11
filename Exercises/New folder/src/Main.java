public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // Boşlukları yazdır
            for (int j = 0; j < i; j++) {
                System.out.print(" "); // Her satırda artan sayıda boşluk
            }
            // Tireleri yazdır
            for (int j = 10 - i; j > 0; j--) {
                System.out.print("-"); // Her satırda azalan sayıda tire
            }
            System.out.println(">");
        }
    }
}

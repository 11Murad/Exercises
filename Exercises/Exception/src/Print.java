public class Print {
    public void printString(String str) {
        if (str.length()>5){
            throw new RuntimeException("String too long");
        }
        else if (str.length()<5) {
            System.out.println(str);
        }
    }
}

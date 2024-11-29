import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> candles = List.of(4,4,1,3);
        System.out.println(birthdayCakeCandles(candles));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int maxHeight = candles.get(0);
        int count = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (maxHeight < candles.get(i)) {
                maxHeight = candles.get(i);
            }
        }
        for (int j = 0; j < candles.size(); j++) {
            if (maxHeight == candles.get(j)) {
                count++;
            }
        }
        return count;
    }
}
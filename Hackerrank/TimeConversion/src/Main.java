public class Main {
    public static void main(String[] args) {
        String s = "07:01:00PM";
        timeConversion(s);


    }

    public static String timeConversion(String s) {
        String k = s.substring(s.length() - 2);
        if (k.equals("PM")){
            String hr= s.substring(0,2);
            int hours = Integer.parseInt(hr);
            int res = (hours + 12) % 24;
            System.out.println(res + s.substring(2,8));
        }

        return null;
    }
}
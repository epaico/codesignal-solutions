package arcade.introduccion;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reto021 {
    public static void main(String[] args) {
        System.out.println(solution2("64.233.161.00"));
    }

    static boolean solution(String strIP) {
         String regex =
                "^(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|[01]?[1-9][1-9]?)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(strIP);

        return matcher.matches();

    }

    static boolean solution2(String strIP) {

        var arr = strIP.split("\\.");
        var errors = new String[]{"00","000","01","001"};

        if (arr.length != 4) return false;

        for (String s : arr) {

            String x =  Arrays.stream(errors).filter(v -> v.equals(s)).findFirst().orElse("");

            if (!x.equals("")) return false;

            String regx = "^[0-9][0-9]?[0-9]?$";
            Pattern pattern = Pattern.compile(regx);
            Matcher matcher = pattern.matcher(s);
            if (matcher.matches()) {
                int valor = Integer.parseInt(s);
                if (valor > 255) return false;
            } else {
                return false;
            }

        }
        return true;

    }

}

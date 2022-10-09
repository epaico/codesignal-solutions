package arcade.introduccion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reto010 {

    public static void main(String[] args) {

       int letterCommons =  solutionBest("aabcc", "adcaa");
        System.out.println(letterCommons);

    }

    static int solution(String s1, String s2) {
        int count = 0;

        String[] arr1 = s1.split("");

        List<String> list2 = Arrays.stream(s2.split(""))
                .collect(Collectors.toList());

        for (String s : arr1) {
            for (int i = 0; i < list2.size(); i++) {
                if (list2.get(i).equalsIgnoreCase(s)) {
                    count++;
                    list2.remove(i);
                    break;
                }
            }
        }

        return count;
    }

    static int solutionBest(String s1, String s2) {
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s2.contains(String.valueOf(s1.charAt(i)))){
                count ++;
                s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)),"");
            }
        }

        return count;
    }



}

package arcade.introduccion;

import java.util.Arrays;

public class Reto015 {
    public static void main(String[] args) {
        String[] pictures = {"abc", "ded"};
        String[] out = solution(pictures);

        for (String el :
                out) {
            System.out.println(el);
        }

    }

    static String[] solution(String[] picture) {

        String[] matrix = new String[picture.length + 2];

        StringBuilder car = new StringBuilder();
        car.append("*".repeat(picture[0].length() + 2));
        matrix[0] = car.toString();
        matrix[matrix.length-1] = car.toString();

        for (int i = 0; i < picture.length ; i++) {
            matrix[i+1] = "*" + picture[i] + "*";
        }

        return matrix;
    }

}

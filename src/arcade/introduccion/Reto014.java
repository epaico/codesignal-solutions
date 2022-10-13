package arcade.introduccion;

import java.util.Arrays;

public class Reto014 {
    public static void main(String[] args) {

        int[] a = {50, 60, 60, 45, 70};
        System.out.println(Arrays.toString(solutionBest(a)));

    }

    static int[] solution(int[] a) {

        int totalEquipo1 = 0;
        int totalEquipo2 = 0;

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                totalEquipo1 += a[i];
            } else {
                totalEquipo2 += a[i];
            }
        }

        return new int[]{totalEquipo1, totalEquipo2};

    }

    static int[] solution2(int[] a) {
        int[] b = {0,0};
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                b[0] +=a[i];
            } else {
                b[1] +=a[i];
            }
        }

        return b;
    }

    static int[] solutionBest(int[] a) {
        int[] b = {0,0};
        for (int i = 0; i < a.length; i++) {
          b[i%2] +=a[i];
        }

        return b;
    }

}

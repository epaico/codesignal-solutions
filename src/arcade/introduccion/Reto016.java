package arcade.introduccion;

import java.util.Arrays;

public class Reto016 {
    public static void main(String[] args) {

        int[] a = {1, 2, 1, 2};
        int[] b = {2, 2, 1, 1};

        System.out.println(solutionBest(a,b));

    }


   static boolean solution(int[] a, int[] b) {
       int count = 0;

       int[] x =  Arrays.copyOf(a,a.length);
       int[] y =  Arrays.copyOf(b,b.length);

       Arrays.sort(x);
       Arrays.sort(y);

       if (!Arrays.toString(x).equalsIgnoreCase(Arrays.toString(y))){
           return false;
       }

       for (int i = 0; i < a.length; i++) {
           if (a[i] != b[i]) count++;
       }

       return count <= 2;
    }

    static boolean solutionBest(int[] a, int[] b) {
        int count = 0, sumA=0, sumB=0;

        for (int i = 0; i < a.length; i++) {
            sumA +=a[i];
            sumB +=b[i];
            if (a[i] != b[i]) count++;
        }

        return count <= 2 && sumA==sumB;
    }
}

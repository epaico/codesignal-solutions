package arcade.introduccion;

import java.util.Arrays;

public class Reto017 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1};
        System.out.println(solutionBest(numbers));
    }

    static int solution(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length -1; i++) {
            while (a[i] >= a[i+1]){
                a[i+1] +=1;
                count++;
            }
        }
        return count;
    }

    static int solutionBest(int[] a) {
        int count = 0, diff;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] >= a[i+1]) {
                diff = a[i] - a[i+1] + 1;
                a[i+1] += diff;
                count +=diff;
            }
        }

        return count;
    }

}

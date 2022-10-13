package arcade.introduccion;


import java.util.Arrays;

public class Reto012 {
    public static void main(String[] args) {
        int[] numbers = {-1, 150, 190, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(solution(numbers)));
    }

    static int[] solution(int[] a) {

        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i +1; j < a.length; j++) {
                if (a[i] != -1){
                    if (a[i] > a[j] && a[j] != -1){
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }

        return a;
    }

}

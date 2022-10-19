package arcade.introduccion;

public class Reto020 {
    public static void main(String[] args) {

        var array = new int[]{2, 4, 1, 0};
        System.out.println(solution(array));
    }

    static int solution(int[] arr) {
        int dif = 0;
        for (int i = 0; i < arr.length -1; i++) {
            int difAbs = Math.abs(arr[i] - arr[i+1]);
            if (difAbs > dif) dif = difAbs;
        }
        return dif;
    }


}

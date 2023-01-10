package arcade.introduccion;

public class Reto22 {
    public static void main(String[] args) {

        var numbers = new int[]{5, 3, 6, 7, 9};
       /* var minimo = solution(numbers);
        System.out.println(minimo);*/
        System.out.println(solution2(numbers));
    }


    static int solution2(int[] array) {
        boolean termino = false;
        int puntero = 1;

        while (!termino) {
            termino = true;
            puntero++;
            for (int j : array) {
                if (j % puntero == 0) {
                    termino = false;
                    break;
                }
            }
        }

        return puntero;
    }
}

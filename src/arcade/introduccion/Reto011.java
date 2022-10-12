package arcade.introduccion;

public class Reto011 {

    public static void main(String[] args) {
        System.out.println(solutionBest(134008));
    }

    static boolean solution(int n) {

        String strNumber = String.valueOf(n);

        int total1 = 0;
        int total2 = 0;

        for (int i = 0; i < strNumber.length(); i++) {
            if (i< strNumber.length()/2){
                total1 += strNumber.charAt(i);
            }else{
                total2 += strNumber.charAt(i);
            }
        }

        return total1 == total2;

    }

    static boolean solutionBest(int n){

        String strNumber = String.valueOf(n);
        int sum = 0;

        for (int i = 0; i < strNumber.length()/2; i++) {
            sum += strNumber.charAt(0) - strNumber.charAt(strNumber.length() -1 -i);
        }

        return sum == 0;
    }
}



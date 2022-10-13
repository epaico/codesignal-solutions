package arcade.introduccion;

public class Reto013 {
    public static void main(String[] args) {

        String input = "foo(bar(baz))blim";
        System.out.println(solutionBest(input));
        System.out.println("foobazrabblim");
    }

    static String solution(String inputString) {

        int indexOpen = inputString.indexOf("(");

        while (indexOpen != -1){
            int indexClose = inputString.indexOf(")");

            String strReplace = inputString.substring(indexOpen,indexClose + 1);
            if (!strReplace.substring(1).contains("(")){
                inputString = inputString.replace(strReplace, new StringBuilder(strReplace.substring(1, strReplace.length()-1)).reverse().toString());
                indexOpen = inputString.indexOf("(");

            }else{
                indexOpen = (indexOpen +1) + strReplace.substring(1).indexOf("(");
            }
        }
        return inputString;

    }

    static String solutionBest(String inputString){
        StringBuilder out = new StringBuilder(inputString);
        int start, end;

        while (out.indexOf("(") != -1){
            start = out.lastIndexOf("(");
            end = out.indexOf(")", start);
            out.replace(start,end+1, new StringBuilder(out.substring(start+1, end)).reverse().toString());
        }
        return out.toString();
    }

}



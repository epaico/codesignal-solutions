package arcade.introduccion;

public class Reto018 {
    public static void main(String[] args) {
        String w = "abbcabb";
        System.out.println(solution(w));

    }

    static boolean solution(String str) {
        int count = 0;
        StringBuilder world = new StringBuilder(str);
        while (!world.toString().isEmpty()){
            int idx = world.lastIndexOf(world.substring(0,1));
            if (idx > 0){
                world.replace(idx,idx+1,"");
            }else{
                count++;
            }
            world.replace(0,1,"");
        }

        return count==0 || count==1;
    }
}



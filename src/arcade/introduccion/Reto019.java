package arcade.introduccion;

public class Reto019 {
    public static void main(String[] args) {


    }

    static boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

        return yourLeft==friendsLeft && yourRight==friendsRight || yourLeft==friendsRight && yourRight== friendsLeft;

    }
}

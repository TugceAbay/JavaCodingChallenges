public class PlayingCat {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(false, 35));

    }

    public static boolean isCatPlaying (boolean summer, int temperature) {

        if(summer == true && temperature >= 25 && temperature <= 45) {
            return true;
        } else return summer == false && temperature >= 25 && temperature <= 35;

    }

}


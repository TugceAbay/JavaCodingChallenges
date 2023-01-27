public class TeenNumberChecker {
    public static void main(String[] args) {

        System.out.println(hasTeen(23,24,25));

    }

     public static boolean hasTeen (int valueOne, int valueTwo, int valueThree) {
        return (isTeen(valueOne) || isTeen(valueTwo) || isTeen(valueThree));
     }

     public static boolean isTeen (int value) {
         return (value >= 13 && value <= 19);
     }
}

public class EqualSumChecker {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum (int valueOne, int valueTwo, int valueThree) {
        return (valueOne + valueTwo) == valueThree;
    }
}

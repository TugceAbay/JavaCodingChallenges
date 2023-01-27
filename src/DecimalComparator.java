public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces (double valueOne, double valueTwo) {
        return (long) (valueOne * 1000) == (long) (valueTwo * 1000);
    }
}

public class GreatestCommonDivisor {

    public static void main(String[] args) {

    }

    public static int getGreatestCommonDivisor (int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }
//        int minNumber = Math.min(first, second);
        int minNumber = (first < second) ? first : second;
        int biggestCommonDivisor=0;
        for (int i=1; i<=minNumber; i++) {
            if ((first%i == 0) && (second%i == 0)) {
                biggestCommonDivisor = i;
            }
        }
        return biggestCommonDivisor;


    }

//    public static int getGreatestCommonDivisor(int first, int second) {
//
//        if (first < 10 || second < 10) {
//            return -1;
//        }
//        while (first != second) {
//            if (first > second)
//                first = first - second;
//            else {
//                second = second - first;
//            }
//        }
//        return second;
//    }
}

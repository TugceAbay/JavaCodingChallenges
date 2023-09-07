public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12,13));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15, 55));
    }

//    public static boolean hasSharedDigit (int numOne, int numTwo) {
//        if ((numOne <= 9) || (numTwo <= 9) || (numOne > 99) ||(numTwo > 99)){
//            return false;
//        }
//        int lastDigit, numTwoStored;
//
//        for (int i=0; i<2; i++) {
//            lastDigit = numOne % 10;
//            numOne /= 10;
//            numTwoStored = numTwo;
//            for (int j=0; j<2; j++) {
//                if (lastDigit == (numTwoStored % 10)) {
//                    return true;
//                }
//                numTwoStored /= 10;
//            }
//        }
//        return false;
//    }

    // Another Solution
    public static boolean hasSharedDigit (int numOne, int numTwo) {
        if ((numOne <= 9) || (numTwo <= 9) || (numOne > 99) ||(numTwo > 99)){
            return false;
        }

        for (int i=numOne; i>0; i /= 10) {
            for (int j=numTwo; j>0; j /= 10) {
                if ((i % 10) == (j % 10)) {
                    return true;
                }
            }
        }
        return false;
    }
}

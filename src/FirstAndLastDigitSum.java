public class FirstAndLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(-5));

    }

    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }
        int sum;
        int lastDigit;
        lastDigit = number % 10;
        while (number > 9) {
            number /= 10;
        }
        sum = number + lastDigit;
        return sum;
    }

    // Alternative Solution

//    public static int sumFirstAndLastDigit (int number) {
//        if (number < 0) {
//            return -1;
//        }
//        int lastDigit, firstDigit = 0;
//        lastDigit = number % 10;
//        while (number > 0) {
//            firstDigit = (number % 10);
//            number /= 10;
//        }
//        return (firstDigit + lastDigit);
//    }
}

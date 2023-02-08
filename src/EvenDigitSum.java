public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(333));
    }

    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int lastDigit;
        while (number > 0) {
            lastDigit = number % 10;
            if((lastDigit % 2) == 0) {
                sum += lastDigit;
            }
            number /= 10;
        }
        return sum;
    }


    // Alternative Solution
//    public static int getEvenDigitSum (int number) {
//        if (number < 0) {
//            return -1;
//        }
//        int sum = 0;
//        while (number > 0) {
//            sum += (number % 2 == 0) ? (number % 10) : 0;
//            number /= 10;
//        }
//        return sum;
//    }
}

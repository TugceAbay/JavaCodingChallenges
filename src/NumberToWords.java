public class NumberToWords {

    public static void main(String[] args) {
//        System.out.println(reverse(-123));
//        System.out.println(getDigitCount(120));
//        numberToWords(123);
//        numberToWords(1010);
//        numberToWords(1000);
   //     numberToWords(-12);
        numberToWords(0);
    }

    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int digitCount = getDigitCount(number);
        int reversedNumber = reverse(number);
        for(int i=0; i<digitCount; i++) {
            int lastDigit = reversedNumber % 10;
            switch (lastDigit) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        }
            reversedNumber /= 10;
        }

//        int digitCount = getDigitCount(number);
//        number = reverse(number);
//        int newDigitCount = getDigitCount(number);
//        if (number == 0) {
//            System.out.println("Zero");
//            return;
//        }
//        while (number > 0) {
//        int lastDigit = number % 10;
//        switch (lastDigit) {
//            case 0:
//                System.out.println("Zero");
//                break;
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            case 4:
//                System.out.println("Four");
//                break;
//            case 5:
//                System.out.println("Five");
//                break;
//            case 6:
//                System.out.println("Six");
//                break;
//            case 7:
//                System.out.println("Seven");
//                break;
//            case 8:
//                System.out.println("Eight");
//                break;
//            case 9:
//                System.out.println("Nine");
//                break;
//        }
//            number /= 10;
//        }
//        if (digitCount != newDigitCount) {
//            for (int i=1; i<=(digitCount-newDigitCount); i++) {
//                System.out.println("Zero");
//            }
//        }
    }

    public static int reverse (int number) {
        int reversedNumber = 0;
        int lastDigit;
        while (number != 0) {
            lastDigit = number % 10;
            reversedNumber = (reversedNumber*10) + lastDigit;
            number/=10;
        }
        return reversedNumber;
    }

    public static int getDigitCount (int number) {
        if (number < 0) {
            return -1;
        }
        int countOfDigits = 1;
        while (number > 9) {
            number /= 10;
            countOfDigits += 1;

        }
        return countOfDigits;
    }
}

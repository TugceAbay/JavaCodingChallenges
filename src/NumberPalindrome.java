public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(-121));

    }

    public static boolean isPalindrome(int number) {
        int storedNumber = number;
        int reverse = 0;
        int lastDigit;
        while (number != 0) {
            reverse *= 10;
            lastDigit = (number % 10);
            reverse += lastDigit;
            number /= 10;
        }
        return (reverse == storedNumber);
    }
}

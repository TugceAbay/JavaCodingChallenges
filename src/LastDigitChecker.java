public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(hasSameLastDigit(1,1,2));
        System.out.println(hasSameLastDigit(9,99,19));
        System.out.println(isValid(9));
        System.out.println(isValid(99));
        System.out.println(isValid(19));
        System.out.println(isValid(9) && isValid(99) && isValid(19));
    }

    public static boolean hasSameLastDigit (int valOne, int valTwo, int valThree) {
        if (isValid(valOne) && isValid(valTwo) && isValid(valThree)) {
            valOne %= 10;
            valTwo %= 10;
            valThree %= 10;
            return ((valOne == valTwo) || (valOne == valThree) || (valTwo == valThree));
        }
        return false;
//        if (!isValid(valOne) || !isValid(valTwo) || !isValid(valThree)) {
//            return false;
//        }
//        return (valOne % 10 == valTwo % 10) || (valOne % 10 == valThree % 10) || (valTwo % 10 == valThree % 10);
    }

    public static boolean isValid (int number) {
        return number <= 1000 && number >= 10;
    }
}

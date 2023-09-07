public class LargestPrime {

    public static void main(String[] args) {
        /*System.out.println(isPrime(9));
        System.out.println(isPrime(11));
        System.out.println(isPrime(121));
        System.out.println(isPrime(41));
        System.out.println(isPrime(64));*/

        System.out.println(getLargestPrime(16));
        System.out.println(getLargestPrime(121));
        System.out.println(getLargestPrime(9));
        System.out.println(getLargestPrime(20));
        System.out.println(getLargestPrime(2));
        System.out.println(getLargestPrime(169));
        System.out.println(getLargestPrime(13));
        System.out.println(getLargestPrime(12));
        System.out.println(getLargestPrime(1456789));

        System.out.println(isPrime(4));



    }

    public static int getLargestPrimeee(int num) {
        if(num<2) return -1;

        for(int i=num-1; i>1; i--) {
            if(num%i == 0 && isPrime(i)) {
                return i;
            }
        }
        return num;
    }

    public static int getLargestPrime(int num) {
        if(num<2) return -1;
        boolean check;
        for(int i=num-1; i>=2; i--) {
            check=true;
            if(num%i == 0) {
                if(i==2) return i;
                for(int j=2;j<i;j++) {
                    if(i%j==0) {
                        check = false;
                        break;
                    }
                }
                if(!check) continue;
                return i;
            }
        }
        return num;
    }


    public static boolean isPrime(int num) {
        if(num<2) {
            return false;
        } else if (num==2) {
            return true;
        }

        for(int i=2; i<=num/2; i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
}

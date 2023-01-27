import java.math.*;

public class SpeedConverter {
    public static void main(String[] args) {

        long star = toMilesPerHour(95.75);
        System.out.println(star);
        printConversation(95.75);
    }

    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            BigDecimal kilometers = new BigDecimal(kilometersPerHour*0.621371192).setScale(2, RoundingMode.HALF_UP);
//            double miles = Math.round((kilometersPerHour * 0.621371192) * 100.00) / 100.00;
            double miles = kilometers.doubleValue();
            return Math.round(miles);
        } else {
            return -1;
        }
    }

    public static void printConversation (double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour<0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");

        }
    }
}

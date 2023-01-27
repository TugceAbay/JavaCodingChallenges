import java.math.*;

public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area (double radius) {
//        if (radius < 0) {
//            return -1;
//        }
//
//        double areaOfCircle = Math.PI * (radius * radius);
//        return areaOfCircle;
        return (radius < 0) ? -1 : (Math.PI * radius * radius);
    }

    public static double area (double x, double y) {
//        if(x < 0 || y < 0) {
//            return -1;
//        }
//
//        double areaOfRectangle = x * y;
//        return areaOfRectangle;
        return (x < 0 || y < 0) ? -1 : (x * y);
    }
}

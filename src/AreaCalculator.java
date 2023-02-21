/*
Practice 1
Ex 3. Area Calculator
 */
public class AreaCalculator {

    public static double area(double radius) {
        double result = Math.PI * Math.pow(radius, 2);
        return (radius < 0) ? -1.0 : result;
    }

    public static double area(double x, double y) {
        return (x < 0 || y < 0) ? -1.0 : (x * y);
    }

}

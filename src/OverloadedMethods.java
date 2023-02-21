/*
Practice 1
Ex 2. Overloaded Method
 */
public class OverloadedMethods {
    static final double INCHES_CM = 0.39370;
    static final int FEET_INCHES = 12;
    public OverloadedMethods() {}

    public double convertToCentimeters(int inches ) {
        return inches / INCHES_CM;
    }
    public double convertToCentimeters(int feet, int inches) {
        int f = feet * FEET_INCHES;
        return convertToCentimeters(inches + f);
    }
}

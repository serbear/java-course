/*
Practice 1
Ex 4. Minutes To Years and Days Calculator
 */

/*

The method should not return anything (void) and it needs to calculate
the years and days from the minutes parameter.


Otherwise, if the parameter is valid then it needs to print a message
in the format "XX min = YY y and ZZ d".

XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.
 */
public class YearsAndDays {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (minutes == 0) {
            System.out.println("Nothing to count");
            return;
        }

        long days = (minutes / 60) / 24;
        long years = days / 365;
        long d = days - (years * 365);

        String result = minutes + " min = " + years + " y and " + d + " d";
        System.out.println(result);

    }
}

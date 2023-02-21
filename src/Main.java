import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        EqualityPrinter equalityPrinter = new EqualityPrinter();
//        equalityPrinter.printEqual(1, 1, 1);
//        equalityPrinter.printEqual(1, 1, 2);
//        equalityPrinter.printEqual(-1, -1, -1);
//        equalityPrinter.printEqual(1, 2, 3);



//        OverloadedMethods overloadedMethods = new OverloadedMethods();
//        // 13in= 33.02000cm
//        double x1 = overloadedMethods.convertToCentimeters(13);
//        // 68in= 172.7200cm
//        double x2 = overloadedMethods.convertToCentimeters(5, 8);
//
//        System.out.println(x1);
//        System.out.println(x2);



//        List<Double> data = Arrays.asList(
//                AreaCalculator.area(5.0),
//                AreaCalculator.area(-1),
//                AreaCalculator.area(5.0, 4.0),
//                AreaCalculator.area(-1.0, 4.0)
//        );
//        for (double n : data) System.out.println(n);




        YearsAndDays.printYearsAndDays(525600);
        YearsAndDays.printYearsAndDays(1051200);
        YearsAndDays.printYearsAndDays(561600);

        List<Boolean> results = Arrays.asList(
                PlayingCat.isCatPlaying(true, 10),
                PlayingCat.isCatPlaying(false, 36),
                PlayingCat.isCatPlaying(false, 35)
        );
        for (boolean x : results) System.out.println(x);

    }

}

/*
Practice 1
Ex 1. Equality Printer
 */

import java.util.*;

public class EqualityPrinter {

    public EqualityPrinter() {
    }

    public void printEqual(int i1, int i2, int i3) {

        List<Integer> numList = Arrays.asList(i1, i2, i3);

        List<ICheckCommand> commands = List.of(
                new CheckUnderZero("Invalid Value"),
                new AllEquals("All numbers are equal"),
                new SomeEqual("Neither all are equal or different")
        );


        for (ICheckCommand command : commands) {
            if (command.check(numList)) {
                System.out.println(command.getMessage());
                return;
            }
        }
        System.out.println("All numbers are different");
    }
}
//        if (isUnderZero(numList)) {
//            printMessage("Invalid Value");
//            return;
//        }
//
//        if (isAllEquals(numList)) {
//            printMessage("All numbers are equal");
//            return;
//        }
//
//        if (isSomeEqual(numList)) {
//            printMessage("Neither all are equal or different");
//            return;
//        }

//        printMessage("All numbers are different");
//    }

//    boolean isUnderZero(List<Integer> numbers) {
//        return numbers.stream().anyMatch(n -> n < 0);
//    }

//    boolean isAllEquals(List<Integer> numbers) {
//        return numbers.stream()
//                .allMatch(n -> Objects.equals(n, numbers.get(0)));
//    }

//    boolean isSomeEqual(List<Integer> numbers) {
//        boolean result = false;
//
//        for (int i = 0; i < numbers.size() - 1; i++) {
//            if (numbers.get(i).equals(numbers.get(i + 1))) {
//                result = true;
//                break;
//            }
//        }
//        return result;
//    }

//    private void printMessage(String messageText) {
//        System.out.println(messageText);
//    }
//}

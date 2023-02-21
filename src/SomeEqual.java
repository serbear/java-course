import java.util.List;

public class SomeEqual extends CheckCommand {
    public SomeEqual(String message) {
        super(message);
    }

    @Override
    public boolean check(List<Integer> numbers) {
        boolean result = false;

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                result = true;
                break;
            }
        }
        return result;
    }
}

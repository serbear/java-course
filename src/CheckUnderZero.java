import java.util.List;

public class CheckUnderZero extends CheckCommand {


    public CheckUnderZero(String message) {
        super(message);
    }

    @Override
    public boolean check(List<Integer> numbers) {
        return numbers.stream().anyMatch(n -> n < 0);
    }

}

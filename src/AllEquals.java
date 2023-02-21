import java.util.List;
import java.util.Objects;

public class AllEquals extends CheckCommand {

    public AllEquals(String message) {
        super(message);
    }

    @Override
    public boolean check(List<Integer> numbers) {
        return numbers.stream()
                .allMatch(n -> Objects.equals(n, numbers.get(0)));
    }
}

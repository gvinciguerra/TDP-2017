import java.util.List;
import java.util.Arrays;

public class CounterHandler extends Handler {
    public CounterHandler(int value) {
        super(value);
    }
    
    public List<Integer> handle(int number) {
        assert number > 0;
        if (this.value <= number) {
            List<Integer> list = successor.handle(number);
            list.set(0, 1 + list.get(0));
            return list;
        }
        return Arrays.asList(0);
    }
}

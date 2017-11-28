import java.util.List;
import java.util.LinkedList;

public class FactorizationHandler extends Handler {
    public FactorizationHandler(int value) {
        super(value);
    }
    
    public List<Integer> handle(int number) {
        assert number > 0;
        if (this.successor == null)
            return new LinkedList<>();

        boolean isFactor = number % this.value == 0;
        List<Integer> list = successor.handle(isFactor ? number / this.value : number);        
        if (isFactor)
            list.add(this.value);
        return list;
    }
}

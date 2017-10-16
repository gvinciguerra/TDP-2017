import java.util.List;
import java.util.Arrays;

public class SamsungCreator extends Creator {
    public List<Product> createProducts() {
        return Arrays.asList(new SamsungRemote(), new SamsungTV());
    }
}

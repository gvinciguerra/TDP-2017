import java.util.List;
import java.util.Arrays;

public class PhilipsCreator extends Creator {
    public List<Product> createProducts() {
        return Arrays.asList(new PhilipsRemote(), new PhilipsTV());
    }
}

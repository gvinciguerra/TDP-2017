import java.util.List;
import java.util.Arrays;

public class PhilipsCreator extends Creator {
    public TV createTV() {
        return new PhilipsTV();
    }
    
    public Remote createRemote() {
        return new PhilipsRemote();
    }
}

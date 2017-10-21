import java.util.List;
import java.util.Arrays;

public class SamsungCreator extends Creator {
    public TV createTV() {
        return new SamsungTV();
    }
    
    public Remote createRemote() {
        return new SamsungRemote();
    }
}

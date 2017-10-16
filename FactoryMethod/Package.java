import java.util.List;
import java.util.ArrayList;

public class Package {
    private List<Product> content;
    
    public Package(List<Product> content) {
        this.content = new ArrayList<>(content);
    }
    
    public List<Product> getContent() {
        return new ArrayList<>(content);
    }
    
    public void close() {
    }
}

import java.util.List;
import java.util.ArrayList;

public class Package {
    private List<Product> content;
    
    public Package(List<Product> content) {
        this.content = new ArrayList<>(content);
    }
    
    public void close() {
        System.out.println("Package closed:");
        for (Product i : content)
            System.out.println("- " + i.getDescription() + " (" + i.getProducer() +")");
    }
}

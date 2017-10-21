import java.util.*;

public abstract class Creator {
    public Package pack() {
        List<Product> products = Arrays.asList(createTV(), createRemote());
        Package p = new Package(products);
        p.close();
        return p;
    }
    
    abstract public TV createTV();
    
    abstract public Remote createRemote();
}

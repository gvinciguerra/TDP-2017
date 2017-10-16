import java.util.List;

public abstract class Creator {
    public Package pack() {
        Package p = new Package(createProducts());
        p.close();
        System.out.println("Package closed:");
        for (Product i : p.getContent())
            System.out.println("- " + i.getDescription() + " (" + i.getProducer() +")");
        return p;
    }
    
    abstract public List<Product> createProducts();
}

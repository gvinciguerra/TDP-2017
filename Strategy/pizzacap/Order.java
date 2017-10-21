package pizzacap;  
import java.util.*;

public class Order {
    private List<Pizza> pizza;
    private Client client;
    private float discount;

    public Order(List<Pizza> p, Client c) {
        pizza = new ArrayList<Pizza>(p);
        client = c;
    }

    public Client getClient() {
        return client;
    }
    
    public List<Pizza> getPizzas() {
        return new ArrayList<Pizza>(pizza);
    }
    
    void setDiscount(float discount) { // We want this to be accessed only inside the same package! 
        this.discount = discount;
    }
    
    public float getTotalPrice() {
        float price = 0;
        for (int i=0; i<pizza.size(); i++)
            price += pizza.get(i).getPrice();
        return price - discount;
    }
    
    public float getDiscount() {
        return discount;
    }
}

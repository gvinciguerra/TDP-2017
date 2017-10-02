package pizzacap;
import java.util.*;
 
public class PizzaCap {
    private DiscountMethod discountMethod;
    private Set<Pizza> menu = new HashSet<>();
    private Set<Client> clients = new HashSet<>();
    private List<Order> orders = new LinkedList<>();

    public PizzaCap(DiscountMethod d) {
        discountMethod = d;
    }
    
    public void addPizzaMenu(Pizza p) {
        menu.add(p);
    }
    
    public void removePizzaMenu(Pizza p) {
        menu.remove(p);
    }
    
    public List<Pizza> getMenu() {
        return new ArrayList<Pizza>(menu);
    }
    
    public DiscountMethod getDiscountMethod() {
        return discountMethod;
    }
    
    public void setDiscountMethod(DiscountMethod d) {
        discountMethod = d;
    }
    
    public Order prepareOrder(List<Pizza> pizzas, Client client) {
        Order o = new Order(pizzas, client);
        o.setDiscount(discountMethod.applyDiscount(o));
        clients.add(client);
        orders.add(o);
        return o;
    }
}

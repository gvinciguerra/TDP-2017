package pizzacap;
import java.util.*;

public class HappyHour implements DiscountMethod {
    public HappyHour() {
    }

    private float leastExpensive(Order o) {
        List<Pizza> pizza = o.getPizzas();
        float price = pizza.get(0).getPrice();
        for (int i = 1; i<pizza.size(); i++) {
            if (pizza.get(i).getPrice() < price) 
                price = pizza.get(i).getPrice();
        }
        return price;
    }

    public float applyDiscount(Order o) {
        // the least expensive pizza is free
        return leastExpensive(o);
    }
}

import java.util.*;

public class CashierScreen implements Observer {
    public CashierScreen() {
    }

    @Override
    public void update(Observable o, Object arg) {
        if (!(o instanceof Order))
            return;
        Order order = (Order) o;
        System.out.println("\nOrder " + order.getId());
        for (Map.Entry<String, Float> f : order.getFoods())
            System.out.println("- " + f.getKey() + " (" + f.getValue() + "€)");
        System.out.println("Total: " + order.getTotal() + " €");
    }
}
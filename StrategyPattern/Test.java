import pizzacap.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        PizzaCap p = new PizzaCap(new NoDiscount());
        Pizza margherita = new Pizza("margherita", (float) 4.5);
        Pizza diavola = new Pizza("diavola", 5);
        Pizza salsiccia = new Pizza("salsiccia", (float) 5.5);
        Client ugo = new Client("Ugo", 0);
        ArrayList<Pizza> order = new ArrayList<Pizza>();
        
        p.addPizzaMenu(margherita);
        p.addPizzaMenu(diavola);
        p.addPizzaMenu(salsiccia);

        order.add(margherita);
        assert 4.5 == p.prepareOrder(order, ugo).getTotalPrice();
        
        order.add(salsiccia);
        p.setDiscountMethod(new HappyHour());
        assert 5.5 == p.prepareOrder(order, ugo).getTotalPrice();
        
        order.add(diavola);
        p.setDiscountMethod(new PercentageOff(0.1f));
        assert 13.5 == p.prepareOrder(order, ugo).getTotalPrice();
    }
}

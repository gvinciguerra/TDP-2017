import java.util.*;

public class Order extends Observable {
    private int id;
    private List<Map.Entry<String, Float>> foods; // [name1->price1, ..., namen->pricen]
    
    public Order(int id) {
        this.id = id;
        this.foods = new LinkedList<>();
    }
    
    public List<Map.Entry<String, Float>> getFoods() {
        return new ArrayList<>(foods); // elem inside foods are immutable, no need to clone
    }
   
    public List<String> getFoodNames() {
        List<String> foodNames = new ArrayList<>(foods.size());
        for (Map.Entry<String, Float> f : foods)
            foodNames.add(f.getKey());
        return foodNames;
    }

    public void addFood(String name, float price) {
        foods.add(new AbstractMap.SimpleImmutableEntry<>(name, price));
        setChanged();
    }
    
    public int getId() {
        return id;
    }

    public float getTotal() {
        float total = 0;
        for (Map.Entry<String, Float> f : foods)
            total += f.getValue().floatValue();
        return total;
    }
}
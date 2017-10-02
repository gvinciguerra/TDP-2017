package pizzacap;

public class PercentageOff implements DiscountMethod {
    private float percentage;
    
    public PercentageOff(float percentage) {
        this.percentage = percentage;
    }

    public float applyDiscount(Order o) {
        return o.getTotalPrice() * percentage;
    }
}

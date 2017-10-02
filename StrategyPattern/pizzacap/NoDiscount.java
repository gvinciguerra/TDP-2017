package pizzacap;

public class NoDiscount implements DiscountMethod {
    public NoDiscount() {
    }

    public float applyDiscount(Order o) {
        // no discount, parameter discarded
        return 0;
    }
}

public class RegularSoda extends Soda {
    public RegularSoda(SodaImplementor sodaImplementor) {
        super(sodaImplementor);
    }
    
    public void pourSoda() {
        System.out.println("Pouring regular:");
        super.pourSoda();
    }
}

public class SuperSizeSoda extends Soda {
    public SuperSizeSoda(SodaImplementor sodaImplementor) {
        super(sodaImplementor);
    }
    
    public void pourSoda() {
        System.out.println("Pouring super size:");
        super.pourSoda();
        super.pourSoda();
    }
}

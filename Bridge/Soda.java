public abstract class Soda {
    protected final SodaImplementor sodaImplementor;
    
    public Soda(SodaImplementor sodaImplementor) {
        this.sodaImplementor = sodaImplementor;
    }
    
    public void pourSoda() {
        sodaImplementor.pourSodaImplementation();
    }
}

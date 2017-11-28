public class FactorizationChainBuilder extends ChainBuilder {
    public FactorizationChainBuilder() {
    }
    
    public void buildHandler(int number) {
        Handler current = new FactorizationHandler(number);
        current.setSuccessor(this.handler);
        this.handler = current;
    }
}

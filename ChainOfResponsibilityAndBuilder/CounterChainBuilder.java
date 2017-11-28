public class CounterChainBuilder extends ChainBuilder {
    public CounterChainBuilder() {
    }
    
    public void buildHandler(int number) {
        Handler current = new CounterHandler(number);
        current.setSuccessor(this.handler);
        this.handler = current;
    }
}

public abstract class ChainBuilder {
    protected Handler handler;
    
    public abstract void buildHandler(int number);
    
    public Handler getHandler() {
        return handler;
    }
}

import java.util.List;

public abstract class Handler {
    protected int value;
    protected Handler successor;

    public Handler(int value) {
        this.value = value;
    }
    
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    
    abstract List<Integer> handle(int number);
}

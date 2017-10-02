import java.awt.Color;

public abstract class State {
    protected TransitionsTable transitionsTable;
    
    public State handlePush() {
        return transitionsTable.nextStateOnPush(this);
    }

    public State handlePull() {
        return transitionsTable.nextStateOnPull(this);
    }
    
    public State(TransitionsTable transitionsTable) {
        this.transitionsTable = transitionsTable;
    }
    
    public abstract Color getColor();
}

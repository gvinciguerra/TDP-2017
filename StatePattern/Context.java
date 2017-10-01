import java.awt.Color;
import java.util.*;

public class Context {
    private State state;
    private TransitionsTable transitionsTable = new TransitionsTable();

    public Context() {
        this.state = transitionsTable.getStates()[0];
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void push() {
        // Replace with setState(transitionsTable.nextStateOnPush(state))
        // for context-controlled transitions
        state.handlePush(this);
    }

    public void pull() {
        state.handlePull(this);
    }

    public TransitionsTable getTransitionsTable() {
        return transitionsTable;
    }

    public static void main(String[] args) {
        Context c = new Context();
        c.push();
        assert c.getState() == c.getTransitionsTable().getStates()[1];
        c.push();
        assert c.getState() == c.getTransitionsTable().getStates()[2];
        c.push();
        assert c.getState() == c.getTransitionsTable().getStates()[3];
        c.push();
        assert c.getState() == c.getTransitionsTable().getStates()[0];
        c.pull();
        assert c.getState() == c.getTransitionsTable().getStates()[2];
        c.pull();
        assert c.getState() == c.getTransitionsTable().getStates()[1];
        c.pull();
        assert c.getState() == c.getTransitionsTable().getStates()[0];
    }
}

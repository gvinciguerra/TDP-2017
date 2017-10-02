import java.awt.Color;
import java.util.*;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
    
    public void setState(State state) {
        this.state = state;
    }

    public void push() {
        // next state is controlled by the current state instance 
        this.state = state.handlePush();
    }

    public void pull() {
        this.state = state.handlePull();
    }
}

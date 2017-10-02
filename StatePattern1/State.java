import java.awt.Color;

public abstract class State {
    public void handlePush(Context c) {
        // Default implementation does nothing -> subclasses can change the behaviour
    }

    public void handlePull(Context c) {
        // Default implementation does nothing -> subclasses can change the behaviour
    }
    
    public abstract Color getColor();
}

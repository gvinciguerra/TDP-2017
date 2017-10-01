import java.awt.Color;

public abstract class State {
    public void handlePush(Context c) {
        c.setState(c.getTransitionsTable().nextStateOnPush(this));
    }

    public void handlePull(Context c) {
        c.setState(c.getTransitionsTable().nextStateOnPull(this));
    }
    
    public abstract Color getColor();
}

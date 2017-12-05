import java.awt.Color;
import java.util.*;

public class BallFactory {
    public BallFlyweight buyBall(Color color) {
        return SharedBall.getInstance().setColor(color);
    }
    
    public BallFlyweight buyBall() {
        return SharedBall.getInstance();
    }
}
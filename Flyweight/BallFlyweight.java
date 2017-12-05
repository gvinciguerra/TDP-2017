import java.awt.Color;
import java.util.Map;
import java.util.HashMap;

public abstract class BallFlyweight {
    private static Map<Color, BallFlyweight> balls = new HashMap<>();
    
    public BallFlyweight setColor(Color color) {
        balls.putIfAbsent(color, new UnsharedBall(color));
        return balls.get(color);
    }
    
    // Can't be in a separate file, dependency inversion principle
    public class UnsharedBall extends BallFlyweight {
        private Color color; // Or any other heavy object
        private String description;

        public UnsharedBall(Color c) {
            this.color = c;
            this.description = String.format("(%d,%d,%d)", c.getRed(), c.getGreen(), c.getBlue());
        }

        public String getDescription() {
            return description;
        }
    }

    public void display() {
        if (getDescription() == null)
            System.out.println("Standard ball");
        else
            System.out.println(getDescription() + "-colored ball");
    }

    protected String getDescription() {
        return null;
    }
}

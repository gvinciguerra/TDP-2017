import java.awt.Color;

public class SharedBall extends BallFlyweight {
    private static final SharedBall instance = new SharedBall();
    
    private SharedBall() {
    }
    
    public static SharedBall getInstance() {
        return instance;
    }
}

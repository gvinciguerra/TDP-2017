import java.awt.Color;

public class Client {
    public static void main(String[] args) {
        BallFactory factory = new BallFactory();
        
        BallFlyweight ball = factory.buyBall();
        ball.display();
        assert ball == factory.buyBall();
        
        ball = ball.setColor(Color.BLUE);
        ball.display();
        assert ball == ball.setColor(Color.BLUE); // one color, one instance
        ball = ball.setColor(Color.RED);
        ball.display();
        assert ball != ball.setColor(Color.BLUE);
    }
}

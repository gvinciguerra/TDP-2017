public class SoccerFacade extends AbstractFacade {    
    SoccerShoes shoes;
    SoccerBall ball;
    
    public void prepare() {
        shoes.take();
        ball.take();
        ball.inflate();
    }
    
    public void play() {
        System.out.println("Playing soccer!");
    }
    
    public void goHome() {
        System.out.println("Going home...");
        ball.putBack();
        shoes.remove();
        shoes.clean();
    }
}

public class BaskedFacade extends AbstractFacade {    
    BasketBall ball;
    BasketShoes shoes;
    
    public void prepare() {
        ball.inflate();
        ball.take();
        ball.trick();
        shoes.take();
    }
    
    public void play() {
        System.out.println("I'm playing basket!");
    }
    
    public void goHome() {
        System.out.println("Going home...");
        shoes.remove();
        shoes.clean();
        ball.putBack();
    }
}

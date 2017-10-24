public class TennisFacade extends AbstractFacade {    
    TennisBall balls;
    TennisShoes shoes;
    Racket racket;
    
    public TennisFacade(TennisBall balls, TennisShoes shoes, Racket racket) {
        this.balls = balls;
        this.shoes = shoes;
        this.racket = racket;
    }
    
    public void prepare() {
        balls.take();
        balls.check();
        shoes.take();
        racket.take();
    }
    
    public void play() {
        System.out.println("Playing tennis!");
    }
    
    public void goHome() {
        System.out.println("Going home...");
        balls.putBack();
        racket.putBack();
        shoes.remove();
        shoes.clean();
    }
}

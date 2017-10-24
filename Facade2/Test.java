public class Test {
    public static void main(String[] args) {
        TennisBall ball = new TennisBall();
        TennisShoes shoes = new TennisShoes();
        Racket racket = new Racket();
        AbstractFacade f = new TennisFacade(ball, shoes, racket);
        
        f.prepare();
        f.play();
        f.goHome(); 
    }    
}

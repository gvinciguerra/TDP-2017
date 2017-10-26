import java.util.*;

public class GameOfLife {
    protected Cell[] cell;
    protected Observable observable = new Observable();
    
    public GameOfLife() {
    }
    
    public void attach(GameOfLifeUI ui) {
        observable.addObserver(ui);
    }

    public void detach(GameOfLifeUI ui) {
        observable.deleteObserver(ui);
    }
    
    public void notifyObservers() {
        observable.notifyObservers(this);
    }
    
    public void advance(LifeVisitor lifeVisitor) {
        
    }
}

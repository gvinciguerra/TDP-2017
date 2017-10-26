import java.util.*;

public abstract class GameOfLifeUI implements Observer {
    public GameOfLifeUI() {
        
    }
    
    @Override
    public void update(Observable observable, Object o) {
        GameOfLife gameOfLife = (GameOfLife) o;
    }
}

import java.util.List;

public class AliveState implements CellState {
    private static AliveState instance;
    
    private AliveState() {
    }
    
    public static AliveState create() {
        if (instance == null)
            instance = new AliveState();
        return instance;
    }
    
    public void accept(LifeVisitor v, Cell c, GameOfLife g, List<LifeCommand> cmds) {
        v.visitLiveCell(c, g, cmds);
    }
    
    @Override
    public CellState live() {
        return this;
    }
    
    @Override
    public CellState die() {
        return DeadState.create();
    }
    
    @Override
    public CellState toggle() {
        return DeadState.create();
    }
    
    @Override
    public boolean isAlive() {
        return true;
    }
}

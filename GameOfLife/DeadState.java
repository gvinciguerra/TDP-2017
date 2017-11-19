import java.util.List;

public class DeadState implements CellState {
    private static DeadState instance;
    
    private DeadState() {   
    }
    
    public static DeadState create() {
        if (instance == null)
            instance = new DeadState();
        return instance;
    }
    
    public void accept(LifeVisitor v, Cell c, GameOfLife g, List<LifeCommand> cmds) {
        v.visitDeadCell(c, g, cmds);
    }
    
    @Override
    public CellState live() {
        return AliveState.create();
    }
    
    @Override
    public CellState die() {
        return this;
    }
    
    @Override
    public CellState toggle() {
        return AliveState.create();
    }
    
    @Override
    public boolean isAlive() {
        return false;
    }
}

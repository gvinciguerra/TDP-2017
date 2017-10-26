import java.util.List;

public abstract class CellState {
    public abstract CellState live();
    
    public abstract CellState die();
    
    public abstract CellState toggle();
    
    public abstract boolean isAlive();
    
    public void accept(LifeVisitor v, Cell c, GameOfLife g, List<LifeCommand> cmds) {
        v.visit(c, g, cmds);
    }
}

import java.util.List;

public class LifeVisitor {
    public void visit(Cell c, GameOfLife g, List<LifeCommand> cmds) {
        c.accept(this, g, cmds);
    }
    
    public void visitLiveCell(Cell c, GameOfLife g, List<LifeCommand> cmds) {
        int aliveNeighbours = c.nbrOfNeighbors(g);
        if (aliveNeighbours < 2)
            cmds.add(new DieCommand(c));
        else if (aliveNeighbours > 3)
            cmds.add(new DieCommand(c));
    }
    
    public void visitDeadCell(Cell c, GameOfLife g, List<LifeCommand> cmds) {
        if (c.nbrOfNeighbors(g) == 3)
            cmds.add(new LiveCommand(c));
    }
}

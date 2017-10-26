import java.util.List;

public interface LifeVisitor {
    public void visit(Cell c, GameOfLife g, List<LifeCommand> cmds);
}

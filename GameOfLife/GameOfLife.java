import java.util.*;

public class GameOfLife {
    private int rows;
    private int cols;
    private Cell[][] grid;
    private List<GameOfLifeUI> observers = new LinkedList<>();
    
    public GameOfLife(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        grid = new Cell[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                grid [i][j] = new Cell(i, j);
    }
    
    public int getRows() {
        return rows;
    }
    
    public int getCols() {
        return cols;
    }
    
    public void attach(GameOfLifeUI ui) {
        observers.add(ui);
    }

    public void detach(GameOfLifeUI ui) {
        observers.remove(ui);
    }
    
    public void advance(LifeVisitor lifeVisitor) {
        List<LifeCommand> cmds = new LinkedList<>();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                grid[i][j].accept(lifeVisitor, this, cmds);
        
        for (LifeCommand c : cmds)
            c.execute();
        
        for (GameOfLifeUI o : observers)
            o.notifyGridChanged();
    }
    
    public Cell[][] getGrid() {
        return grid;
    }
}

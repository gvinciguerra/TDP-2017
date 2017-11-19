import java.util.List;

public class Cell {
    private int row;
    private int col;
    private CellState cellState;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellState = DeadState.create();
    }

    public void live() {
        cellState = cellState.live();
    }

    public void die() {
        cellState = cellState.die();
    }

    public int nbrOfNeighbors(GameOfLife g) {
        int result = 0;
        int bottomBound = Math.min(row + 1, g.getRows() - 1);
        int rightBound = Math.min(col + 1, g.getCols() - 1);
        for (int i = Math.max(0, row - 1); i <= bottomBound; i++)
            for (int j = Math.max(0, col - 1); j <= rightBound; j++)
                if (!(i == row && j == col) && g.getGrid()[i][j].isAlive())
                    result++;
        return result;
    }

    public void toggle() {
        this.cellState = cellState.toggle();
    }

    public boolean isAlive() {
        return cellState.isAlive();
    }

    public void accept(LifeVisitor v, GameOfLife g, List<LifeCommand> cmds) {
        cellState.accept(v, this, g, cmds);
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}

public class Cell {
    protected int row;
    protected int col;
    protected CellState cellState;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void live() {
        cellState.live();
    }
    
    public void die() {
        cellState.die();
    }
    
    public void nbrOfNeighbors(GameOfLife gameOfLife) {
    }
    
    public void toggle() {
        this.cellState = cellState.toggle();
    }
    
    public boolean isAlive() {
        return cellState.isAlive();
    }
    
    public void accept(LifeVisitor visitor) {
        //cellState.accept(visitor, this, gameOfLife, commands);
    }
}

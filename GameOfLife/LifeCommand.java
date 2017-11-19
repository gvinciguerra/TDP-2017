public abstract class LifeCommand {
    protected Cell cell;

    public LifeCommand(Cell cell) {
        this.cell = cell;
    }
    
    public abstract void execute();
}

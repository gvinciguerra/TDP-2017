public class AliveState extends CellState {
    protected static AliveState instance;
    
    private AliveState() {
        if (instance == null)
            instance = new AliveState();
    }
    
    @Override
    public CellState live() {
        return DeadState.create();
    }
    
    @Override
    public CellState die() {
        return this;
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

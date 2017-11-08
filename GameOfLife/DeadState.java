public class DeadState extends CellState {
    protected static DeadState instance;
    
    private DeadState() {   
    }
    
    public static DeadState create() {
        if (instance == null)
            instance = new DeadState();
        return instance;
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

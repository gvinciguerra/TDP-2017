public class TreeOriginator {
    private Strategy state;
    
    public TreeOriginator() {
    }
    
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }
    
    public void setState(Strategy state) {
        this.state = state;
    }
    
    public Memento createMemento() {
        return new Memento(state);
    }
    
    public void display() {
        if (state == null)
            System.out.println(toString());
        else
            state.printDecoration(this);
    }
    
    public String toString() {
        return "Standard Tree";
    }
}

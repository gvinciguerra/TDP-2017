public class Memento {
    private Strategy state;

    public Memento(Strategy state) {
        this.state = state;
    }

    public Strategy getState() {
        return state;
    }
}

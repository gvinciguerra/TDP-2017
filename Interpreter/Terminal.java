public class Terminal implements Expression {
    private int value;
    
    public Terminal(int value) {
        this.value = value;
    }
    
    public int evaluate() {
        return value;
    }
}

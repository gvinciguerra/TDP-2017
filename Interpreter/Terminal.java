public class Terminal implements Expression {
    private boolean value;
    
    public Terminal(int value) {
        this.value = (value == 1);
    }
    
    public boolean evaluate() {
        return value;
    }
}

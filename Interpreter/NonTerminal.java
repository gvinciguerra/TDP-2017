public abstract class NonTerminal implements Expression {
    protected Expression left;
    protected Expression right;
    
    public NonTerminal(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    
    public NonTerminal(Expression e) {
        this.left = e;
    }
}

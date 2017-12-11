public class NotExpression extends NonTerminal {   
    public NotExpression(Expression e) {
        super(e);
    }

    public int evaluate() {
        return 1 - left.evaluate();
    }
}

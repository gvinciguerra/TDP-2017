public class NotExpression extends NonTerminal {   
    public NotExpression(Expression e) {
        super(e);
    }

    public boolean evaluate() {
        return !left.evaluate();
    }
}

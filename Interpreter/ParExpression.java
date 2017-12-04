public class ParExpression extends NonTerminal {
    public ParExpression(Expression e) {
        super(e);
    }

    public boolean evaluate() {
        return left.evaluate();
    }
}

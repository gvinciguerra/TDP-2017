public class ParExpression extends NonTerminal {
    public ParExpression(Expression e) {
        super(e);
    }

    public int evaluate() {
        return left.evaluate();
    }
}

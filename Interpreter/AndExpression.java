public class AndExpression extends NonTerminal {
    public AndExpression(Expression left, Expression right) {
        super(left, right);
    }

    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}

public class OrExpression extends NonTerminal {
    public OrExpression(Expression left, Expression right) {
        super(left, right);
    }

    public int evaluate() {
        return 1 - (1 - left.evaluate()) * (1 - right.evaluate());
    }
}

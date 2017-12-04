public class AndExpression extends NonTerminal {
    public AndExpression(Expression left, Expression right) {
        super(left, right);
    }

    public boolean evaluate() {
        //lazy
        boolean first = left.evaluate();
        if (!first)
            return false;
        return right.evaluate();
    }
}

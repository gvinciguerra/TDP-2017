public class OrExpression extends NonTerminal {
    public OrExpression(Expression left, Expression right) {
        super(left, right);
    }

    public boolean evaluate() {
        //lazy
        boolean first = left.evaluate();
        if (first)
            return first;
        return right.evaluate();
    }
}

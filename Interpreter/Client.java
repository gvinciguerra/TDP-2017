public class Client {
    public static void main(String[] args) {
        Expression e_false = new Terminal(0);
        Expression e_true = new Terminal(1);
        Expression e_and1 = new AndExpression(e_true, e_true);
        Expression e_or1 = new OrExpression(e_true, e_false);
        Expression e_par1 = new ParExpression(e_or1);
        Expression e_par2 = new ParExpression(e_and1);
        Expression e_and2 = new AndExpression(e_or1, e_and1);
        Expression e_par3 = new ParExpression(e_and2);
        Expression e_not = new NotExpression(e_par3);
        Expression e_or2 = new OrExpression(e_false, e_true);
        Expression e_par4 = new ParExpression(e_or2);
        Expression e_final = new OrExpression(e_not, e_par4);
        
        System.out.println("not((1 or 0) and (1 and 1)) or (0 or 1)");
        System.out.println(e_final.evaluate());
        System.out.println();
        Expression e_final2 = new AndExpression(e_not, e_par4);        
        System.out.println("not((1 or 0) and (1 and 1)) and (0 or 1)");
        System.out.println(e_final2.evaluate());
    }
}

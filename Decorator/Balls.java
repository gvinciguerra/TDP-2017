public class Balls extends AbstractDecorator {
    private int number;
    
    public Balls(Tree t, int n) {
        tree = t;
        number = n;
        System.out.println("You added " + n + " balls, for a total cost of " + n * 0.25 + " dollars");
    }

    @Override
    public String getDescription() {
        return tree.getDescription() + ", balls";
    }
    
    @Override
    public double cost() {
        return number * 0.25 + tree.cost();
    }
}

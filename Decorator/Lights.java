public class Lights extends AbstractDecorator {
    int number;

    public Lights(Tree t, int n) {
        tree = t;
        number = n;
        System.out.println("You added " + n + " lights, for a total cost of " + n * 2.5 + " dollars");
    }
    
    @Override
    public String getDescription() {
        return tree.getDescription() + ", lights";
    }
    
    @Override
    public double cost() {
        return number * 2.5 + tree.cost();
    }
}

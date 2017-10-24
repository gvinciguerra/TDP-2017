package treestore;

public class Balls extends AbstractDecorator {
    private int number;
    
    public Balls(Tree t, int n) {
        tree = t;
        number = n;
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

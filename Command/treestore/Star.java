package treestore;

public class Star extends AbstractDecorator {
    int cost;
    String description = "";

    public Star(Tree t) {
        cost = 3;
        description = ", star";
        tree = t;
    }
    
    @Override
    public String getDescription() {
        return tree.getDescription() + description;
    }
    
    @Override
    public double cost() {
        return cost + tree.cost();
    }
}

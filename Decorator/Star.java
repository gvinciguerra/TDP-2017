public class Star extends AbstractDecorator {
    private int cost;
    private String description = "";

    public Star(Tree t) {
        if (checkIfPresent(t))
            System.out.println("You already added a star!"); // An alternative is to throw an exception
        else {
            cost = 3;
            description = ", star";
            System.out.println("You added 1 star, for a total cost of 3 dollars");
        }
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
    
    private boolean checkIfPresent(Tree t) {
        while (t instanceof AbstractDecorator)
            if (t instanceof Star)
                return true;
            else
                t = ((AbstractDecorator) t).getPreviousDecorator();
        return false;
    }
}

package treestore;

public abstract class Tree {
    protected String description = "Abstract description";

    public abstract double cost();
    
    public String getDescription() {
        return description;
    }
    
    @Override
    public String toString() {
        return getDescription();
    }
}

public abstract class AbstractDecorator extends Tree {
    Tree tree;
    
    public abstract String getDescription();
    
    protected Tree getPreviousDecorator() {
        return tree;
    }
}

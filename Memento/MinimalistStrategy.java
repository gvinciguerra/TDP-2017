public class MinimalistStrategy implements Strategy {
    public MinimalistStrategy() {
    }
    
    public void printDecoration(TreeOriginator tree) {
        System.out.println("We don't even need a " + tree);
    }
}

public class ElegantStrategy implements Strategy {
    private int balls;
    
    public ElegantStrategy(int balls) {
        this.balls = balls;
    }
    
    public void printDecoration(TreeOriginator tree) {
        System.out.println("Decorating " + tree + " with:");
        System.out.printf("- %d platinum balls\n", balls);
        System.out.println("- 1 gold star");
    }
}

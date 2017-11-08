public class Test {
    public static void main(String args[]) {
        PancakeRecipe p1 = new CustomaryUnitsPancakeRecipe();
        PancakeRecipe p2 = new MetricUnitsPancakeRecipe();
        p1.prepareRecipe();
        System.out.println("\n-----------\n");
        p2.prepareRecipe();
    }
}

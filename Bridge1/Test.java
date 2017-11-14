public class Test {
    public static void main(String[] args) {
        Soda soda1 = new RegularSoda(new ColaImplementor());
        Soda soda2 = new SuperSizeSoda(new RootBeerImplementor());
        soda1.pourSoda();
        soda2.pourSoda();
    }
}

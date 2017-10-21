public class Test {
    public static void main(String[] args) {
        Tree t = new BluSpruce();
        t = new Star(t);
        t = new Balls(t, 7);
        t = new Lights(t, 2);
        t = new Star(t);
        t = new Balls(t, 2);
        System.out.println("Total cost: " + t.cost() + " dollars");
        Tree t2 = new FraserFir();
        t2 = new Star(t2);
        System.out.println("Total cost: " + t2.cost() + " dollars");
    }
}

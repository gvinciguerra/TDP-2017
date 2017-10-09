public class FraserFir extends Tree {
    public FraserFir() { 
        description = "Fraser Fir";
        System.out.println("You added a Fraser Fri tree for 12 dollars");
    }

    @Override
    public double cost() {
        return 12;
    }
}

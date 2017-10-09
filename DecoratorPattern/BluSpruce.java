public class BluSpruce extends Tree {
    public BluSpruce() { 
        description = "Colorado Blu Spruce";
        System.out.println("You added a Colorado blu Spruce tree for 20 dollars");
    }

    @Override
    public double cost() {
        return 20;
    }
}

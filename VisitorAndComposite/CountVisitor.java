public class CountVisitor implements Visitor {
    private int redCounter = 0;
    private int blueCounter = 0;
    private int greenCounter = 0;
    
    public CountVisitor() {
    }
    
    public void visitColors(Colors c) {
        switch(c.tellMeTheColor()) {
            case "red": 
                redCounter++;
                break;
            case "blue": 
                blueCounter++;
                break;
            case "green" :
                greenCounter++;
                break;
            default: break;
        }
    }
    
    public void getResults() {
        System.out.println("reds: " + redCounter + 
                           " blues: " + blueCounter +
                           " greens: " + greenCounter);
    }
}

public abstract class Colors implements Element {
    protected String color = "";
    
    public void accept(Visitor v) {
        v.visitColors(this);
    }

    public String tellMeTheColor() {
        return color;
    }
    
    public abstract int compareTo(Colors c);
}
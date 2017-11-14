public class Blue extends Colors {
    public Blue() {
        color = "blue";
    }
    
    public int compareTo(Colors c) {
        //the blue color is always the last
        return 1;
    }
}

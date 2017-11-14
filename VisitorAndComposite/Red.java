public class Red extends Colors {
    public Red() {
        color = "red";
    }

    public int compareTo(Colors c) {
        //the red color is always the first
        return -1;
    }
}

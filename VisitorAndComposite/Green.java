public class Green extends Colors {
    public Green() {
        color = "green";
    }
    
    public int compareTo(Colors c) {
        //the green color is in the middle
        switch (c.tellMeTheColor()) {
            case "red" :
                return 1;
            case "blue" :
                return -1;
            default :
                return -1;
        }
    }
}

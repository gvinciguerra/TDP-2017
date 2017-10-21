package pizzacap;

public class Client {
    private String name;
    private int points;

    public Client(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
    
    public String getName() {
        return name;
    }
    
    void updatePoints(int points) {
        this.points += points;
    }
}

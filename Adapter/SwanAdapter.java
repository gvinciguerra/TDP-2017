public class SwanAdapter implements Duck {
    Swan swan;
    
    public SwanAdapter(Swan swan) {
        this.swan = swan;
    }
    public void display() {
        swan.show();
    }
    public void swim() {
        swan.swim(); 
    }
}

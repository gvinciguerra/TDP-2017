public class TurkeyAdapter implements Duck {
    Turkey turkey;
    
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    
    public void display() {
        turkey.show();
    }
    
    public void swim() {
        turkey.swim();
    }
}
public class Duckling implements Duck {
    @Override
    public void display() {
        System.out.println("Duck says: I'm a pretty little duckling");
    } 
    
    @Override
    public void swim() {
        System.out.println("Duck says: I'm learning...");
    }
}

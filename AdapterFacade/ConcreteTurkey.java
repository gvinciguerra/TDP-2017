public class ConcreteTurkey implements Turkey {  
    @Override
    public void appear() {
        System.out.println("Turkey says: I'm very large and hate thanksgiving day!");
    }
    
    @Override
    public void swim() {
        System.out.println("Turkey says: Can I swim?");
    }
}

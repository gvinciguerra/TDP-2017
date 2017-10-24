public class DuckTest {
    public static void main(String[] args) {
        Swan ug = new UglyDuckling();
        Turkey t = new ConcreteTurkey();
        
        FacadeAdapter fad1 = new FacadeAdapter(ug);
        FacadeAdapter fad2 = new FacadeAdapter(t);
        
        new Client(fad1);
        new Client(fad2);
    }   
}

public class DuckTest {
    public static void main(String[] args) {
        Duck duck = new Duckling();
        Swan ug= new UglyDuckling();
        Duck swanAdapter = new SwanAdapter(ug);
        Client client = new Client(duck, swanAdapter);
        
        System.out.println("\nThe second duck becomes turkey");
        Turkey t = new ConcreteTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(t);
        client.changeDuck(swanAdapter, turkeyAdapter);
        
        System.out.println("\nThe first duck becomes swan");
        client.changeDuck(duck, swanAdapter);
    }   
}

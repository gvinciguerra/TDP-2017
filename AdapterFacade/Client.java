public class Client {
    private Duck duck;
    
    public Client(Duck f) {
        duck = f;
        duck.display();
        duck.swim();
    }
}
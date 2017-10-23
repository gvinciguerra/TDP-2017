public class Client {
    private Duck duck1, duck2;
    
    public Client(Duck d1, Duck d2) {
        duck1 = d1;
        duck2 = d2;
        System.out.println("\nThe first duck says...");
        testDuck(duck1);
        System.out.println("\nThe second duck says...");
        testDuck(duck2);     
    }

    static void testDuck(Duck duck) {
        duck.display();
        duck.swim();
    }
    
    public void changeDuck(Duck oldDuck, Duck newDuck) {
        if (duck1.equals(oldDuck)) 
            duck1 = newDuck;
        else if (duck2.equals(oldDuck)) 
            duck2 = newDuck;
        System.out.println("\nThe first duck says...");
        testDuck(duck1);
        System.out.println("\nThe second duck says...");
        testDuck(duck2);
    }
}
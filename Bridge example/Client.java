public class Client {
    
    public Client()
    {
    }

    public static void main(String[] args) {
        BasicSeller bs = new BasicSeller(new FiatBuilder());
        
        System.out.println("Building a basic fiat");
        Car c = bs.createCarBasicColor();
        c.getDescription();
        
        
        PremiumSeller ps = new PremiumSeller(new FordBuilder());
        
        System.out.println("\nBuilding a fancy ford");
        Car c2 = ps.createFancyCar("chromed red", "alloy wheels, gps, A/C");
        c2.getDescription();
    }
}

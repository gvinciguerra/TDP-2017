public class PremiumSeller {
    private CarBuilder cb;
    
    public PremiumSeller(CarBuilder cb) {
        this.cb = cb;
    }

    public Car createFancyCar(String color, String extra) {
        cb.buildCar();
        System.out.println("Building the engine...");
        cb.buildEngine();
        System.out.println("Building the car body...");
        cb.buildCarBody();
        System.out.println("Building the intern...");
        cb.buildIntern();
        System.out.println("Painting the car...");
        cb.paint(color);
        System.out.println("Adding extra expensive stuff...");
        cb.addFancyStuff(extra);
        
        return cb.getCar();
    }
}

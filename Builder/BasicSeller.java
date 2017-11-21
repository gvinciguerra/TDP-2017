public class BasicSeller {
    private CarBuilder cb;
    
    public BasicSeller(CarBuilder cb) {
        this.cb = cb;
    }

    public Car createCarBasicColor() {
        cb.buildCar();
        System.out.println("Building the engine...");
        cb.buildEngine();
        System.out.println("Building the car body...");
        cb.buildCarBody();
        System.out.println("Building the intern...");
        cb.buildIntern();
        System.out.println("Painting the car...");
        cb.paint("blue");
        
        return cb.getCar();
    }
    
    public Car createCarPersonalizedColor(String color) {
        cb.buildCar();
        System.out.println("Building the engine...");
        cb.buildEngine();
        System.out.println("Building the car body...");
        cb.buildCarBody();
        System.out.println("Building the intern...");
        cb.buildIntern();
        System.out.println("Painting the car...");
        cb.paint(color);
        
        return cb.getCar();
    }
    
}

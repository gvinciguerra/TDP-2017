public class FiatBuilder implements CarBuilder {
    
    Car c;
    String brand = "Fiat";
    
    public FiatBuilder()
    {
        
    }

    public void buildCar() {
        c = new Car();
        c.setBrand("Fiat");
    }
    
    public void buildEngine() {
        c.setEngine("Punto engine");
        System.out.println("Punto engine created!\n");
    }
    
    public void paint(String color) {
        c.setColor(color);
        System.out.println("Car painted in " + color + "!\n");
    }
    
    public void buildIntern() {
        c.setIntern("Punto intern");
        System.out.println("Punto intern created!\n");
    }
    
    public void buildCarBody() {
        c.setBody("Punto body");
        System.out.println("Punto body created!\n");
    }
    
    public void addFancyStuff(String stuff) {
        c.setExtra(stuff);
        System.out.println("Added fancy stuff!\n");
    }
    
    public Car getCar() {
        return c;
    }
}

public class FordBuilder implements CarBuilder {
    
    Car c;
    String brand = "Ford";
    
    public FordBuilder()
    {
       
    }

    public void buildCar() {
        c = new Car();
        c.setBrand(brand);
    }
    
    public void buildEngine() {
        c.setEngine("Focus engine");
        System.out.println("Focus engine created!\n");
    }
    
    public void paint(String color) {
        c.setColor(color);
        System.out.println("Car painted in " + color + "!\n");
    }
    
    public void buildIntern() {
        c.setIntern("Focus intern");
        System.out.println("Focus intern created!\n");
    }
    
    public void buildCarBody() {
        c.setBody("Focus body");
        System.out.println("Focus body created!\n");
    }
    
    public void addFancyStuff(String stuff) {
        c.setExtra(stuff);
        System.out.println("Added fancy stuff!\n");
    }
    
    public Car getCar() {
        return c;
    }
}

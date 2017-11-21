public class Car {
    private String brand;
    private String color;
    private String intern;
    private String engine;
    private String carBody;
    private String extra;
    
    public Car() { 
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setIntern(String intern) {
        this.intern = intern;
    }
    
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    public void setBody(String carBody) {
        this.carBody = carBody;
    }
    
    public void setExtra(String extra) {
        this.extra = extra;
    }
    
    public void getDescription() {
        System.out.println("This is a wonderful " + color + " " + brand + "! "
                            + "\nIt has a brand new " + intern + " and " + carBody
                            + ", not to mention it's incredible " + engine + "!");
                            
        if (extra != null) 
            System.out.println("And it's not over! You have also all these extras: "
                                + extra + "! \nWhat an amazing customer you are!\n");
    }
}

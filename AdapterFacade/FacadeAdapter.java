public class FacadeAdapter implements Duck {
    private Turkey t;
    private Swan s;
    
    public FacadeAdapter(Swan s) {
        this.s = s;
    }
    
    public FacadeAdapter(Turkey t) {
        this.t = t;
    }
    
    @Override
    public void display() {
        if (t != null) t.appear();
        if (s != null) s.show();
    }
    
    @Override
    public void swim() {
        if (t != null) t.swim();
        if (s != null) s.swim();
    }
}

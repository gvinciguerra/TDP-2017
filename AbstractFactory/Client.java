public class Client {
    IStore store;
    
    public Client(IStore store) {
        this.store = store;
        store.getDescription();
    }

    public void pack(){
        if (store == null) return;
        
        AbstractTV tv = store.buyTV();
        tv.getDescription();
        
        AbstractRC rc = store.buyRC();
        rc.getDescription();
    }
    
    public static void main(String[] args) {
        Client c1 = new Client(new PhilipsStore());
        c1.pack();
        Client c2 = new Client(new SamsungStore());
        c2.pack();
    }
}

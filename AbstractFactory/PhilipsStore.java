public class PhilipsStore implements IStore {
    public PhilipsStore() {

    }
    
    public AbstractTV buyTV() {
        return new PhilipsTV();
    }
    
    public AbstractRC buyRC() {
        return new PhilipsRC();
    }
    
    public void getDescription() {
        System.out.println("Buying from Philips Store");
    }
}

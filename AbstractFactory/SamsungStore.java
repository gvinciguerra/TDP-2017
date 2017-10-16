public class SamsungStore implements IStore {
    public SamsungStore() {
        
    }

    public AbstractTV buyTV() {
        return new SamsungTV();
    }
    
    public AbstractRC buyRC() {
        return new SamsungRC();
    }
    
    public void getDescription() {
        System.out.println("Buying from Samsung Store");
    }
}

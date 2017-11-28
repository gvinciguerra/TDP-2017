public class LoanRequest {
    
    private int amount;
    private String clientInformation;
    
    public LoanRequest(int amount, String clientInformation) {
        this.amount = amount;
        this.clientInformation = clientInformation;
    }

    public int getAmount() {
        return amount;
    }
    
    public String getClientInformation() {
        return clientInformation;
    }
}

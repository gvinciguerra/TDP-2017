public class Director extends BankEmployee {
    
    public Director(BankEmployee next, int max, String role) {
        super(next, max, role);
    }

    protected boolean checkInfo(LoanRequest lr) {
        //check if the request is acceptable
        String info = lr.getClientInformation();
        return info.equals("Employed");
    }
}

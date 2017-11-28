public abstract class BankEmployee {
    
    protected BankEmployee next;
    protected int maxLoan;
    protected String role;
    
    public BankEmployee(BankEmployee next, int max, String role) {
        this.next = next;
        maxLoan = max;
        this.role = role;
    }
    
    public final boolean checkLoan(LoanRequest lr) {
        System.out.println(role + " is verifing the request...");
        if (lr.getAmount() <= maxLoan) 
                if (checkInfo(lr)) {
                    System.out.println("Accepted!\n");
                    return true;
                } else {
                    System.out.println("Your request has been denied!\n");
                    return false;
                }
                
        if (next != null) {
            System.out.println("Passing the request to " + next.getRole()); 
            return next.checkLoan(lr);
        } else {
            System.out.println("Your request has been denied!\n");
            return false;
        }
        
    }
    
    protected boolean checkInfo(LoanRequest lr) {
        //hook method, implemented only for higher positions
        return true;
    }
    
    protected void updateNext(BankEmployee next) {
        this.next = next;
    }
    
    public String getRole() {
        return role;
    }
    
    public int getMaxLoan() {
        return maxLoan;
    }
    
    protected void updateMaxLoan(int maxLoan) {
        this.maxLoan = maxLoan;
    }
}

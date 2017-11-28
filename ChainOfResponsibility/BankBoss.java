public abstract class BankBoss extends BankEmployee {
    
    public BankBoss(BankEmployee next, int max, String role) {
        super(next, max, role);
    }
    
    public void fire(BankEmployee fired, BankEmployee promoted) {
        BankEmployee high = fired.next;
        int maxLoan = fired.getMaxLoan();
        
        promoted.updateNext(high);
        promoted.updateMaxLoan(maxLoan);
    }
    
}

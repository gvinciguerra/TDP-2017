public class MegaGalacticDirector extends BankBoss {
    
    public MegaGalacticDirector(BankEmployee next, int max, String role) {
        super(next, max, role);
    }

    protected boolean checkInfo(LoanRequest lr) {
        //I'm the mega director, I rule.
        return false;
    }
}

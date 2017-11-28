public class Client {
    
    public Client() { }
    
    public static void main(String[] args) {
        BankBoss mgd = new MegaGalacticDirector(null, 
                               Integer.MAX_VALUE, 
                               "Mega Galactic Director");
        BankEmployee d = new Director(mgd, 500000, "Director");
        BankEmployee dd = new DeputyDirector(d, 200000, "Deputy Director");
        BankEmployee de = new DeskEmployee(dd, 50000, "Desk Employee");
        
        LoanRequest lr1 = new LoanRequest(13000, "Unemployed");
        LoanRequest lr2 = new LoanRequest(125000, "Unemployed");
        LoanRequest lr3 = new LoanRequest(215000, "Employed");
        LoanRequest lr4 = new LoanRequest(210000, "Unemployed");
        LoanRequest lr5 = new LoanRequest(1000000, "Employed");
        
        System.out.println("Asking for a loan of 13000 from unemployed...");
        de.checkLoan(lr1);
        System.out.println("Asking for a loan of 125000 from unemployed...");
        de.checkLoan(lr2);
        System.out.println("Asking for a loan of 215000 from employed...");
        de.checkLoan(lr3);
        System.out.println("Asking for a loan of 210000 from unemployed...");
        de.checkLoan(lr4);
        System.out.println("Asking for a loan of 1000000 from employed...");
        de.checkLoan(lr5);
        
        System.out.println("Firing the Deputy Director");
        mgd.fire(dd, de);
        System.out.println("Asking for a loan of 210000 from unemployed...");
        de.checkLoan(lr4);
        
    }
}

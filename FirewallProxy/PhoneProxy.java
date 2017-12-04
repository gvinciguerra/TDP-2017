import java.util.*;

public class PhoneProxy implements PhoneInterface {
    private PhoneInterface phone = new Phone();
    private HashSet<String> blacklist = new HashSet<>();
    
    public PhoneProxy() {
    }
    
    public void call(String number) {
        if (!checkIfBlocked(number))
            phone.call(number);
        else
            System.out.println("Impossible to call " + number + ": the number is in blacklist!");
    }
    
    public void incomingCall(String number) {
        if (checkIfBlocked(number))
            System.out.println("Incoming call from " + number + " blocked");
        else 
            phone.incomingCall(number);
    }
    
    public void text(String number, String text) {
        if (!checkIfBlocked(number))
            phone.text(number, text);
        else
            System.out.println("Impossible to text to " + number + ": the number is in blacklist!");
    }
    
    public void incomingText(String number, String text) {
        if (checkIfBlocked(number))
            System.out.println("Incoming text from " + number + " blocked");
        else 
            phone.incomingText(number, text);
    }
    
    public List<String> getBlackList() {
        return new ArrayList<String>(blacklist);
    }
    
    public boolean addNumberToBlackList(String number) {
        return blacklist.add(number);
    }
    
    public boolean removeNumberFromBlackList(String number) {
        return blacklist.remove(number);
    }
    
    public boolean checkIfBlocked(String number) {
        return blacklist.contains(number);
    }
}

import java.util.*;

public interface PhoneInterface {
    public void call(String number);
    
    public void incomingCall(String number);
    
    public void text(String number, String text);
    
    public void incomingText(String number, String text);
}

import java.util.*;

public class Phone implements PhoneInterface {
    public Phone() {
    }
    
    public void call(String number) {
        System.out.println("Calling " + number);
    }
    
    public void incomingCall(String number) {
        System.out.println("Incoming call from " + number);
    }
    
    public void text(String number, String text) {
        System.out.println("Sending text to : " + number);
        System.out.println("Text of the message: \n" + text);
    }
    
    public void incomingText(String number, String text) {
        System.out.println("You just received a new text from " + number);
        System.out.println("Text is the following: \n" + text);
    }
}

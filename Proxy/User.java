import java.util.*;

public class User {
    public static void main(String[] args) {
        PhoneProxy proxy = new PhoneProxy();
        
        if (proxy.addNumberToBlackList("3286154278"))
            System.out.println("3286154278 added to blacklist");
        else
            System.out.println("3286154278 already in blacklist");
        if (proxy.addNumberToBlackList("3286113548"))
            System.out.println("3286113548 added to blacklist");
        else
            System.out.println("3286113548 already in blacklist");
        if (proxy.addNumberToBlackList("3243187364"))
            System.out.println("3243187364 added to blacklist");
        else
            System.out.println("3243187364 already in blacklist");
        if (proxy.addNumberToBlackList("3286154278"))
            System.out.println("3286154278 added to blacklist");
        else
            System.out.println("3286154278 already in blacklist");

        System.out.println();
            
        List<String> list = proxy.getBlackList();
        System.out.println("Numbers in blacklist: ");
        for (String s : list)
            System.out.println(s);
        System.out.println();
        
        proxy.call("3286154278");
        proxy.call("3286154279");
        proxy.text("3286154278", "Hello world!");
        proxy.text("3286154272", "Hello world!");

        System.out.println();
        
        proxy.incomingCall("3286154278");
        proxy.incomingCall("3286154258");
        proxy.incomingText("3286154278", "Hello to you too!");
        proxy.incomingText("3286854278", "Hello to you too!");
        
        System.out.println();
        
        if (proxy.removeNumberFromBlackList("3286154278")) 
            System.out.println("3286154278 successfully removed from blacklist");
        else
            System.out.println("Unable to remove 3286154278 from blacklist, maybe it's not present");
        if (proxy.removeNumberFromBlackList("3286154268")) 
            System.out.println("3286154268 successfully removed from blacklist");
        else
            System.out.println("Unable to remove 3286154268 from blacklist, maybe it's not present");
        
        System.out.println();
            
        List<String> list2 = proxy.getBlackList();
        System.out.println("Numbers in blacklist: ");
        for (String s : list2)
            System.out.println(s);
        
        System.out.println();
        
        if (proxy.checkIfBlocked("3286154268"))
            System.out.println("3286154268 is blocked");
        else
            System.out.println("3286154268 is not blocked");
        if (proxy.checkIfBlocked("3243187364"))
            System.out.println("3243187364 is blocked");
        else
            System.out.println("3243187364 is not blocked");
    }
}

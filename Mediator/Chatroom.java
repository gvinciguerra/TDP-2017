import java.util.*;

public class Chatroom extends AbstractChatroom
{
    private AbstractMap<String, Participant> users;
    private AbstractMap<String, List<String>> groups;
    
    public Chatroom() { 
        users = new HashMap<String, Participant>();
        groups = new HashMap<String, List<String>>();
    }
    
    public void register(Participant participant) {
        if (users.containsKey(participant.getName())) {
            System.out.println("The name already exists!");
            return;
        }

        System.out.println(participant.getName() + " joined the chatroom!");
        users.put(participant.getName(), participant);
    }
    
    public void send(String from, String to, String msg) {
        if (!users.containsKey(from) || !users.containsKey(to)) {
            System.out.println("Users not registred");
            return;
        }
        
        Participant toSend = users.get(to);
        toSend.receive(from, msg);
    }
    
    public boolean createGroup(String idGroup, List<String> participants) {
        if (groups.containsKey(idGroup)) {
            System.out.println("Group already exists");
            return false;
        }
            
        for (String s : participants) {
            if (!users.containsKey(s)) {
                System.out.println("User " + s + " is not registred!");
                return false;
            }
        }
        
        groups.put(idGroup, participants);
        System.out.println("The group " + idGroup + " has been created!");
        return true;
    }
    
    public void sendToGroup(String idGroup, String sender, String msg) {
        if (!groups.containsKey(idGroup))
            return;
        
        System.out.println(sender + " is sending a message to the group " + idGroup); 
            
        for (String pName : groups.get(idGroup)) {
            if (!pName.equals(sender)) {
                Participant p = users.get(pName);
                p.receive(idGroup, msg);
            }
        }
    }
}

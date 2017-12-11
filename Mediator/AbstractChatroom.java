import java.util.*;

public abstract class AbstractChatroom {
    
    public abstract void register(Participant participant);
    
    public abstract void send(String from, String to, String msg);
    
    public abstract boolean createGroup(String idGroup, List<String> participants);
    
    public abstract void sendToGroup(String idGroup, String sender, String msg);
}
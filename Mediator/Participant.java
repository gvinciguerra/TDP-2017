import java.util.*;

public class Participant {
    private String name;
    private AbstractChatroom chatroom;
    
    public Participant(String name, AbstractChatroom chatroom) {    
        this.name = name;
        this.chatroom = chatroom;
        chatroom.register(this);
    }
    
    public String getName() {
        return name;
    }
    
    public void receive(String from, String msg) {
        System.out.println("[" + name + "] New message received from: " + from);
        System.out.println("Text of the message:\n" + msg + "\n");
    }
    
    public void sendPrivate(String to, String msg) {
        chatroom.send(name, to, msg);
    }
    
    public void createGroup(String idGroup, List<String> ps) {
        chatroom.createGroup(idGroup, ps);
    }
    
    public void sendGroup(String idGroup, String msg) {
        chatroom.sendToGroup(idGroup, name, msg);
    }
}

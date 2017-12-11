import java.util.*;

public class Test {
    
    public static void main(String[] args) {
        AbstractChatroom chatroom = new Chatroom();
        Participant ugo = new Participant("Ugo", chatroom);
        Participant alfonso = new Participant("Alfonso", chatroom);
        Participant arcibaldo = new Participant("Arcibaldo", chatroom);
        Participant ambrosio = new Participant("Ambrosio", chatroom);
        Participant ruby = new Participant("Ruby", chatroom);
        List<String> uglyNames = new ArrayList();
        
        uglyNames.add("Alfonso");
        uglyNames.add("Arcibaldo");
        uglyNames.add("Ambrosio");
        
        System.out.println();
        
        alfonso.sendPrivate("Arcibaldo", "How are you?");
        arcibaldo.sendPrivate("Alfonso", "Fine thanks, you?");
        alfonso.sendPrivate("Arcibaldo", "Fine, even with these names of us!");
        
        ambrosio.createGroup("Ugly names", uglyNames);
        
        System.out.println();
        
        ambrosio.sendGroup("Ugly names", "What's up guys??");
        
        ugo.sendPrivate("Ruby", "We are excluded... :(");
    }
}

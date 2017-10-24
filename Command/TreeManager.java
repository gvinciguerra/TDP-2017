import java.util.*;
import treestore.*;

public class TreeManager {
    private Deque<Tree> decorationsStack = new LinkedList();
    
    public TreeManager(Tree tree) {
        decorationsStack.push(tree);
    }
    
    public Tree getCurrentTree() {
        return decorationsStack.peek();
    }
    
    public void addDecoration(AbstractCommand command) {
        command.perform(this);
    }
    
    void pushDecoration(Tree tree) {
        decorationsStack.push(tree);
    }
    
    boolean popDecoration() {
        if (decorationsStack.size() > 1) {
            decorationsStack.pop();
            return true;
        }
        return false;
    }
    
    public void epiphany() {
        Calendar calendar = Calendar.getInstance();
        boolean isEpiphany = 6 == calendar.get(Calendar.DAY_OF_YEAR);
        if (true) { // isEpiphany
            while (popDecoration());
            System.out.println("Boxed all decoration");
        }
    }
}

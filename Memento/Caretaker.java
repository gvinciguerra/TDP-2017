import java.util.Deque;
import java.util.LinkedList;

public class Caretaker {
    public static void main(String[] args) {
        Deque<Memento> stack = new LinkedList<>();
        
        TreeOriginator tree = new TreeOriginator();
        tree.display();
        
        System.out.println("\nCARETAKER feels minimalist...");
        tree.setState(new MinimalistStrategy());
        tree.display();
        
        System.out.println("\nCARETAKER saves memento and switches state");
        Memento memento1 = tree.createMemento();
        stack.addFirst(memento1);
        tree.setState(new ElegantStrategy(10));
        tree.display();
        
        System.out.println("\nCARETAKER saves memento and switches state");
        Memento memento2 = tree.createMemento();
        stack.addFirst(memento2);
        tree.setState(new ElegantStrategy(1000));
        tree.display();
        
        System.out.println("\nCARETAKER asks to restore memento");
        Memento restored = stack.removeFirst();
        tree.restoreMemento(restored);
        tree.display();
    }
}

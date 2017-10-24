import treestore.*;

public class Client {
    public static void main(String[] args) {
        TreeManager treeManager = new TreeManager(new FraserFir());
        treeManager.addDecoration(new SadCommand());
        System.out.println("Before epiphany: " + treeManager.getCurrentTree());
        treeManager.epiphany();
        System.out.println("After epiphany: " + treeManager.getCurrentTree());
    }
}

import treestore.DecorationFactory;
import treestore.Tree;

public class SadCommand extends AbstractCommand {
    public void perform(TreeManager treeManager) {
        Tree t = treeManager.getCurrentTree();
        t = DecorationFactory.decorateStar(t);
        treeManager.pushDecoration(t);
    }
}

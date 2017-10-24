import treestore.DecorationFactory;
import treestore.Tree;

public class PremiumCommand extends AbstractCommand {
    public void perform(TreeManager treeManager) {
        Tree t = treeManager.getCurrentTree();
        t = DecorationFactory.decorateLights(t, 3);
        t = DecorationFactory.decorateBalls(t, 5);
        t = DecorationFactory.decorateStar(t);
        treeManager.pushDecoration(t);
    }
}

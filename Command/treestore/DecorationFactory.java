package treestore;

import java.util.*;

public class DecorationFactory
{
    /*
       Whith this solution all decoration classes can be made private and
       moved to a package whith DecorationFactory. 
       Hence this Factory is like a facade!
    */
    
    private static Set<Tree> set = new HashSet<Tree>();
    
    private DecorationFactory() { }
    
    public static Tree decorateStar(Tree t) {
        if (set.contains(t)) {
            System.out.println("You can't add more than one star!");
            return t;
        }
        Tree d = new Star(t);
        set.add(d);
        return d;
    }
    
    public static Tree decorateLights(Tree t, int n) {
        Tree d = new Lights(t, n);
        manageSet(t, d);
        return d;
    }
    
    public static Tree decorateBalls(Tree t, int n) {
        Tree d = new Balls(t, n);
        manageSet(t, d);
        return d;
    }
    
    private static void manageSet(Tree t, Tree d) {
        if (set.contains(t)) {
            set.remove(t);
            set.add(d);
        }
    }
}

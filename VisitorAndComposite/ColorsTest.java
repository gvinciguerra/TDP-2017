import java.util.*;

public class ColorsTest {
   public static void main(String[] arg) {
       List<Element> list = new ArrayList<Element>();
       List<Element> list2 = new ArrayList<Element>();
       list2.add(new Blue());
       list2.add(new Green());
       list2.add(new Red());
       list2.add(new Blue());
       list2.add(new Red());
       Element collection1 = new ColorCollection(list2);
       list.add(new Green());
       list.add(new Red());
       list.add(new Blue());
       list.add(new Red());
       list.add(collection1);
       list.add(new Blue());
       list.add(new Green());
       list.add(new Red());
       list.add(new Green());
       Element mycollection = new ColorCollection(list);
       
       Visitor myVisitor = new CountVisitor();
       mycollection.accept(myVisitor);
       myVisitor.getResults();
       
       Visitor v2 = new SortingVisitor();
       mycollection.accept(v2);
       v2.getResults();  
    }
}
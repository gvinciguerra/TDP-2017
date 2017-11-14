import java.util.*;

public class ColorCollection implements Element {
    private ArrayList<Element> colorArray;
   
    public ColorCollection(List<Element> el) {
        colorArray = new ArrayList<Element>(el);
    }

    public void accept(Visitor v){
        for (Element e : colorArray)
             e.accept(v);
    }
}

import java.util.*;

public class SortingVisitor implements Visitor {
   protected List<Colors> orderedList = new ArrayList<Colors>();  
   
   public void visitColors(Colors c) {
       orderedList.add(c);
   }
   
   public void getResults() {
       Collections.sort(orderedList, new Comparator<Colors>() {
			@Override
			public int compare(Colors c1, Colors c2) {
				return c1.compareTo(c2);
			}
		});
	
       for (Colors c : orderedList)
           System.out.print(c.tellMeTheColor() + " ");
       
       System.out.println();
   }
}

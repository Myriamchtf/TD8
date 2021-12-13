import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class fusion {
	
	public static <T> List<T> fusion(List<? extends T>l1, List<?extends T>l2){
	if(l1.size() != l1.size()){
		throw new IllegalArgumentException(" not the same size");
	}
	if(l1.isEmpty() || l2.isEmpty()) {
		return Collections.emptyList();
		}
	
	List<T> fusion = new ArrayList<T>(l1.size());

	Iterator<?extends T> it1 = l1.iterator();
	Iterator<?extends T> it2 = l2.iterator();

	while(it1.hasNext()){
		fusion.add(it1.next());
		fusion.add(it2.next());
	}

	return fusion;
		
}
	
	
	
	
	
/*
 * Pour n'importe qu'elle collection, si on utilise <Iterator> la compléxité sera tjrs O(n) : 
 */


}

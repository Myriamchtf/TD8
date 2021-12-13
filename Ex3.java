import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex3 {
	
	/*
	 * si liste vide retourner Collections.EmptyList et pas nulle car il réfère a un objet qui est vide
	 * if (list.isEmpty()) :
	 * return Collections.EmptyList 
	 * Collections.EmptyList()
	 * quand on fait un type parametré on doit spécifier le type de retour

	 */

	public static <T extends CharSequence> List<Integer> listLength(List<T> list)   {
		 if (list.isEmpty()) {
            return Collections.emptyList() ;
		 }
		 
        ArrayList<Integer> length = new ArrayList<Integer>() ;
        for (int i = 0; i < list.size(); i++) {
        	
                T seq = list.get(i) ;
                length.add(seq.length()) ;
        }
        
        return length ;
 }

    public static List<Integer> listLength2(List< ? extends CharSequence> list)      {
        ArrayList<Integer> length = new ArrayList<Integer>() ;
        
        for (int i = 0; i < list.size(); i++) {
        	
                CharSequence seq = list.get(i) ;
                length.add(seq.length()) ;
                
        }
        return length ;
 }
    
}

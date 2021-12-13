import java.util.List;
import java.util.Random;

public class melange {
	
	/*
	 * Question 1 et 2
	 * LINKELIST shuffle utilise set donc complexité de set est O(1)
	 * shuffle compléxité O(n²) 
	 * ARRAYLIST compléxité de set = n 
	 * shuffle compléxité O(n²)
	 */
	private static <E> void swap(List<E> l, int i, int j) {
		
		E Temp = l.get(i);
		l.set(i, l.get(i));
		l.set(j, l.get(i));
	}
	
	private static void swapw(List<?> l, int i, int j) {
		swap(l, i, j);
	}
	
	/*
	 * Question 3 et 4
	 */
	public static <E> void swaprandom(List<E> l) {
		Random rand = new Random(); 
		int i1 = l.size()-1;
		for(int i = i1 ; i >0 ; i++) {
			int j = rand.nextInt(i); //RANDOM 0 à i
			swap(l, i, j);
		}
	}
	
	public static <E> void swapw(List<?> l) {
		Random rand = new Random(); 
		int i1 = l.size()-1;
		for(int i = i1 ; i >0 ; i++) {
			int j = rand.nextInt(i); //RANDOM 0 à i
			swap(l, i, j);
		}
	}
	
	/*
	 * Question 4 : comme set(i) , mélange compléxité O(n²) 
	 * 
	 * Collections.shuffle(mylist, new Random());
	 * "elle copie d'abord la liste dans un tableau, 
	 * puis mélange la copie du tableau et 
	 * recopie enfin le tableau dans la liste " 
	 * <Iterator> la compléxité est O(n)
	 * donc compléxité O(2n) !! 
	 * https://www.geeksforgeeks.org/collections-shuffle-method-in-java-with-examples/
	 */
}

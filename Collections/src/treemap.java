
import java.util.*;
public class treemap {

	public static void main(String[] args) {
		
		
		TreeMap<Long,Contacts> tree=new TreeMap<>();
		tree.put(1L,(new Contacts("----NAME----","-------E-MAIL Address-----","----GENDER----")));
		tree.put(9140551008L,(new Contacts("harshi","  harshi@gmail.com","   female")));
		tree.put(6519091008L,(new Contacts("Siddu","   sid@gmail.com","   Male")));
		tree.put(9623871008L,(new Contacts("Bharath","  1234@gmail.com","   Male")));
		tree.put(7640551008L,(new Contacts("sakshi" ," saksi@gmail.com","   female")));
		tree.put(5340551008L,(new Contacts("raool","  raool@gmail.com","   Male")));
		//System.out.println(tree);
		Set<Map.Entry<Long,Contacts>> entrySet=tree.entrySet();//returns view of entire map
		//System.out.println(entrySet);
		//Map.Entry<Long, Contact>[] entryArray=entrySet.toArray(new Map.Entry[entrySet.size()]);
		System.out.println("Key of Tree Map are :\n");
		for(Map.Entry<Long, Contacts> entryArray:entrySet) {
			System.out.println(entryArray.getKey());
		}
		System.out.println("Values of Tree Map are :\n");
		for(Map.Entry<Long, Contacts> entryArray:entrySet) {
			System.out.println(entryArray.getValue());
		}

	}

}


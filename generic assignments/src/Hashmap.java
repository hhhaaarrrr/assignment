import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer,Double> Random1 = new HashMap<Integer,Double>();
		Random1.put(124, 19.3);
		Random1.put(123, 12.9);
		Random1.put(131, 10.0);
		Random1.put(132, 21.66);
		Random1.put(146, 16.7);
		Random1.put(133, 51.7);
		Random1.put(134, 14.0);
		Random1.put(143, 11.2);
		Random1.put(121, 122.4);
		Random1.put(125, 191.3);
		
		System.out.println("Size of Random1 is:"+ Random1.size());
		System.out.println(Random1);
		
		if(Random1.containsKey(134)) {
			double a = Random1.get(134);
			System.out.println("Value of key 134 is "+ a);
			
			
		}
		
	}
}
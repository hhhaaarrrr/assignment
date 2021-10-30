
public class stringbuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("StringBuilder");
		
		sb.append(" is a peer class of String");
		sb.append(" that provides much of");
		sb.append(" the functionality of strings");
		
		System.out.println(sb);
	
		StringBuilder sb1 = new StringBuilder("It is used to _ at the specified index position ");
		System.out.println(sb1);
		
	
		sb1.replace(13, 15, " insert text");
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
	
	}

}

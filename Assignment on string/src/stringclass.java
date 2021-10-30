
public class stringclass {

	public static void main(String[] args) {
		String str ="Hello World";
		int len = str.length();
		
		System.out.println("length of given string is :" + " "+ len);

	
		String str1 = " Hello";
		str1 = str1.concat("  How  are you");
		System.out.println("new string is :"+ " "+ str1);
		
		
		String str2 = " Java String pool refers to collection of Strings which are stored in heap memory";
		String upper = str2.toUpperCase();
		String lower = str2.toLowerCase();
		String replace = str2.replace('a', '$');
		
		System.out.println("upper case:"+" "+upper);
		System.out.println("lower case:"+ " "+lower);
		System.out.println("replace char:"+ " "+replace);
		
		
		if(str2.contains("collection"))
		{
			System.out.println("collection is present");
		}
		else {
			System.out.println("collection is not present");
		}
	
		String str3 =("java string pool refers to collection of strings which are stored in heap memory");
		
		if (str2.compareTo(str3)==0)
		{
			System.out.println("string matches");
		}
		else {
			System.out.println("string not matches");
		}
		if (str2==str3)
		{
			System.out.println("string matches");
		}
		else {
			System.out.println("string not matches");
		}
	
	}

}


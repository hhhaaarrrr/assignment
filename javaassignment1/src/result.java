import java.util.Scanner;
public class result {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter the marks of three subjects");
		
		int a,b,c;
		
		System.out.println("enter the marks of first subject"); 
		a= scn.nextInt();
		
		System.out.println("enter the marks of second subject"); 
		b= scn.nextInt();
				
		System.out.println("enter the marks of third subject"); 
		c= scn.nextInt();
		

		
		if( (a&b&c)>60 )
			System.out.println("passed"); 
		else ( (a&b)|(b&c)| (c&a) > 60 );
			System.out.println("promoted");
		
		elseif ((a&b&c)<60);
			
			System.out.println("failed"); 
		
	
	}

}

import java.util.Scanner;
public class assg1 {

	public static void main(String[] args) {
		
		 
			try {
				Scanner scn = new Scanner(System.in);
				 
				 System.out.println("enter the dividend");
				 int divident = scn.nextInt();
				 
				 System.out.println("enter the divisor");
				 int divisor = scn.nextInt();
				 
				 int result = divident/divisor;
				 
				 System.out.println("result:"+ result);
			} //catch (Exception e) {
				
				//e.printStackTrace();
			//}
			 
			catch(ArithmeticException e) {
			
			 System.out.println("main method ends...");}
		 
		

	}

}

import java.util.Scanner;
public class simpleandcompoundinterest {

	public static void main(String[] args) {
		double si,ci,p,time,amount;
		float rate;
		Scanner scn = new Scanner(System.in);
			
		System.out.println("enter the principle amount ");
		p = scn.nextDouble();
			
		System.out.println("enter the time in years ");
		time = scn.nextDouble();
			
		System.out.println("enter the rate of interest  ");
		rate = scn.nextFloat();
		
		si=(p*time*rate)/100;
		System.out.println("simple interest after "+ time + " years is: "+ si);
		
		int n;
		System.out.println("enter the number of times interest  ");
		n = scn.nextInt();
		
		amount= p*Math.pow(1+(rate/n), n*time );
		ci= amount- p;
		
		System.out.println("compound interest after " + time +"  years is: "+ ci);
		
	
	
	
	}


}

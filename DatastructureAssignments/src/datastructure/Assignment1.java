package datastructure;

public class Assignment1 {

	public static void main(String[] args) {
		
		int num =153;
		int temp = num;
		int	total=0;

		while (num > 0) {	    
		    int n = (num % 10);
		    num = num / 10;
		    total = total+(n*n*n);
		}
			 
		 System.out.println(total==temp ? temp +" Is armstrong": temp +" Not an Armstrong");	 
	}

}

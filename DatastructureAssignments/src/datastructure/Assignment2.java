package datastructure;

public class Assignment2 {

public static void main(String[] args) {
	 
	int a=100;
	int b = 999;
	 
	for (int i=a; i<=b;i++) {
		
		int temp = i;
		int	total=0;
		while (temp > 0) {	    
		    int sn = (temp % 10);
		    temp = temp / 10;
		    total = total+(sn*sn*sn);
		}

		if(total==i) {
			System.out.println(" " + i);
		}
		total=0;
	}
  
}

}

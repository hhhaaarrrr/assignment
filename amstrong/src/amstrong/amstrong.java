package amstrong ;


public class amstrong {

	public static void main(String[] args) {
		System.out.println(" the number");
		
		int num =153;
		
		int temp= num;
		int sum = 0;
		int len=(num+"").length();
		
			while(num >0)
			{
					int a=num%10;
					int p=1;
				for(int i=1;i<=len;i++)
				{
					p=p*a;
				}
				
			 sum= p+sum;
			 num=num/10;
		    }	
	if  (sum==temp)
		{ System.out.println(" number is amstrong");}
	else 
		{System.out.println("number is not amstrong");
		
		}

}
}
public class amstrongnumrange 
{

	public static void main(String[] args) 
	{
		System.out.println("amstrong numbers form 100 to 999"); 
		for (int i=100; i < 1000; i++)
		{
				int sum=0;
				int num= i;
				while(num>0)
			{
				int a=num%10;
				sum =sum + (a*a*a);
				num=num/10;
				
				if(sum == i)
				System.out.println(i);
			}		
				
		}	
		
		
	}

}


public class bank 
{
	
		String name;
		double balance;
		
		public String getname()
		{
			return this.name;
		}
	
		public void setname(String name) 
		{
			this.name= name;
			
		}
	
		public void deposite(double amount)	
		{
			this.balance = this.balance+amount;
		}
		
		public boolean withdraw(double amount)
		{
			if(balance> amount)
			{balance = balance - amount;
				return true;
			}
			else 
			{
				return false;
			}
		
		}
}			
class savingsaccount extends bank{
	public void fixed()
	
}

class currentaccount extends bank{}

}

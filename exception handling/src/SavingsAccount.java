
public class SavingsAccount {

	
		long id;
		double balance=0;
		double withdraw;
		double deposit;
		double amount;
		
	public  double balance()
		{
		return balance;
			
		}
	
	void deposit(double deposit)
	{
		double amount = 1000000;
		balance = balance+ amount;
	}
	

public void withdraw(double amount)throws InsufficientBalaceException
{
		if(balance <amount) {
			System.out.println();
			throw new InsufficientBalaceException("insuffient balance in account");
			}
			
			
		elseif (amount<=0) {
				System.out.println();
				throw new IllegalArgumentException("insuffient balance in account");
		}
		 balance= balance-amount;
}


}
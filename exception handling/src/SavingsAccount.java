
public class SavingsAccount {

	
		long id;
		double balance=0;
		double withdraw;
		double deposit;
		
	public  double balance()
		{
		return balance;
			
		}
	public void deposit(double amount)
	{
		balance += amount ;
	}
	
	public void withdraw(double amount)throws InsufficientBalanceException , IllegalArgumentException
{
		if(balance <amount) {
			System.out.println();
			throw new InsufficientBalanceException("insuffient balance in account");
			}
			
			
		else if (amount<=0) {
				System.out.println();
				throw new IllegalArgumentException("entered amount is illegal ");
		}
		 balance= balance-amount;
}


}

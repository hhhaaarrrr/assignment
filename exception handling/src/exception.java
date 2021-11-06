
public class exception {

	public static void main(String[] args) {

		SavingsAccount sv =new SavingsAccount();
		try {
			sv.deposit(200000);
			sv.withdraw(2000);
			System.out.println("Your Balance is :"+ sv.balance());
			
			//sv.withdraw(2221000);
			//System.out.println("Your Balance is :"+ sv.balance());
			
			sv.withdraw(-1000);
			System.out.println("Your Balance is :"+ sv.balance());
		}
		 catch(InsufficientBalanceException e) {
			
			e.printStackTrace();
		}
		
		
}	
}

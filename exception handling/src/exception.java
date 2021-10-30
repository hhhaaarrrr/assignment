
public class exception {

	public static void main(String[] args) {

		SavingsAccount sv =new SavingsAccount();
		try {
			
			sv.withdraw(2000);
			System.out.println("Your Balance is :"+ sv.balance());
			
			sv.withdraw(2221000);
			System.out.println("Your Balance is :"+ sv.balance());
			}
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			sv.withdraw(-1000);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Your Balance is :"+ sv.balance());
		}
		
		
}	
}

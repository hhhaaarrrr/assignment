package JunitAssignmentQ3;

public class BankAccount {

	long loginID= 123456;
	double balance =20000;
	
	public void showInfo() {
		System.out.println("LoginId : " + loginID + "\n" + "Balance : " + balance);
	}
	
	public void withDraw(double amount) throws InsufficientBalanceException{
		if( balance < amount || balance==0) {
			throw new InsufficientBalanceException();
		}else {
			balance -= amount;
			System.out.println("Your money debited with amount " + amount+" and now available balance is  "+balance);
		}
	}
	
}

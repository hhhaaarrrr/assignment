
public class InsufficientBalanceException extends Exception{

		private String display;
			InsufficientBalanceException(String display) {
				super(display);
				this.display = display;
			}
			InsufficientBalanceException() {
				super("insufficient balance");
				this.display = display;	
			}
			
			public String getMessage() {
				return display;
			}
		}



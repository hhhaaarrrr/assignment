
public class IllegalArgumentException extends exception {
	
		private String display;
			IllegalArgumentException(String display) {
				super(display);
				this.display = display;
			}
			IllegalArgumentException() {
				super("illegal argument");
				this.display = display;	
			}
			
			public String getMessage() {
				return display;
			}
		

}

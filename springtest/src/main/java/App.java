
public class App {
	private String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public void sayhello() {
		System.out.println("hello"+this.name);
	}
	
}

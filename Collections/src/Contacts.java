
public class Contacts {
	
	private String name;
	private String Email;
	private String Gender;
	public Contacts(String name, String email, String gender) {
		
		this.name = name;
		Email = email;
		Gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return Email;
	}
	public String getGender() {
		return Gender;
	}
	public String toString() {
		return ""+this.name+" "+this.Email+" "+this.Gender;
	}
}




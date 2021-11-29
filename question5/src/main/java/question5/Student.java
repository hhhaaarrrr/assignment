package question5;

	import javax.annotation.Resource;
	import org.springframework.beans.factory.annotation.Required;
	public class Student {
		

		
		   private Integer age;
		   private String name;

		  
		   public void setAge(Integer age) {
		      this.age = age;
		   }
		   public Integer getAge() {
		      return age;
		   }
		   
		  @Resource(name="Ram")
		   public void setName(String name) {
		      this.name = name;
		   }
		   public String getName() {
		      return name;
		   }
		
	}







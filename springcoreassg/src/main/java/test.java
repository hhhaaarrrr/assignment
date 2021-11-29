
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	//private static ApplicationContext context;

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("springbean.xml");

		//Setter Injection
			
			//Customerclass customer = (Customerclass)context.getBean("customer");
			//customer.displayInfo();
			
			//Constructor Injection

			Customerclass customer2 = (Customerclass)context.getBean("customer1");
			customer2.displayInfo();
      
	}

}

	


import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class customertest {
	@Test
	public void test() {
	ApplicationContext context = new ClassPathXmlApplicationContext("springbean.xml");
	Customerclass cust = (Customerclass)context.getBean("customer1");
	
	 
	Customerclass obj2 = new Customerclass(1, "harshitha", 9845638247L,new Addressclass("abc", "bangalore", "karnataka", "560066", "India"));
	
	
	if (cust.getCustomerName().equals(obj2.getCustomerName())) {
		System.out.println("Success");
	} else {
		System.out.println("Not yet implemented");
	}
}
	

}

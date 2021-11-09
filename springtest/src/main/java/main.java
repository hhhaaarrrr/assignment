import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class main {
	//private static ApplicationContext context;
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	
		App hellobean =(App) context.getBean("App");
		hellobean.sayhello();
			
	}
}

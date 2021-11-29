package question5;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Springcore_qn5/config.xml");
      
      Student student = (Student) context.getBean("student");
      System.out.println("Name : " + student.getName() );
      System.out.println("Age : " + student.getAge() );
   }
}
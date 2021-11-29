package springcoreassignment3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("LifeCycle.xml");
		context.registerShutdownHook();
		BeanLifeCycle obj =(BeanLifeCycle) context.getBean("beanLifeCycle");
		obj.show();
		/*
		BeanLifeCycleAnnotation obj2=(BeanLifeCycleAnnotation)context.getBean("BeanLifeCycleAnn");
		System.out.println(obj2);
		*/
	}

}
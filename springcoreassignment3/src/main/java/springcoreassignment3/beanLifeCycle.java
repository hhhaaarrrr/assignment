package springcoreassignment3;

public class beanLifeCycle {
	private String LifeCreated;
	private int count;
	
	public void setLifeCreated(String lifeCreated) {
		LifeCreated = lifeCreated;
	}
	public String getLifeCreated() {
		return LifeCreated;
	}
	public int getCount() {
		return count;
	}
	
	public beanLifeCycle(String LifeCreated,int count) {
		System.out.println("Inside BeanLifeCycle Constructor ");
		this.LifeCreated=LifeCreated;
		this.count=count;
	}
	
	public void show() {
		System.out.println("Inside Show : "+getLifeCreated());
	}
	
	
	//init-method and destroy-method
	public void init() {
		System.out.println("Object has been Initalized (PostInitialisation)");
	}
	
	public void destroy() {
		System.out.println("Destroying object (PreDestroying)...");
	}
	

}
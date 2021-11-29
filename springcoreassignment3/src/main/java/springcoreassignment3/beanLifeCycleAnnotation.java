package springcoreassignment3;

public class beanLifeCycleAnnotation {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		//System.out.println("Inside setter");
		this.value = value;
	}

	public beanLifeCycleAnnotation() {
		super();
	}

	@Override
	public String toString() {
		return "beanLifeCycleAnnotation [value=" + value + "]";
	}
	
	@PostConstruct
	public void Start() {
		System.out.println("\nBean Constructed");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("\nBean is About to destroy...");
	}
	
	
}
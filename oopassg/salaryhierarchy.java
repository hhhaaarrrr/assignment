
public class salaryhierarchy {

	public static void main(String[] args) 
	{
		manager m1 = new manager("harshitha",50000,2000);
		System.out.println("salary of manager"+" "+ m1.name +" "+"is:"+ m1.getsalary());
		
		labour l1 = new labour ("vinay",20000,1000);
		System.out.println("salary of labour"+" "+ l1.name +" "+"is:"+ l1.getsalary());
				

	}

}


class employee
{
	String name;
	int salary;

	employee()
	{
		name = null;
		salary = 0;
	}
	
	employee(String name, int salary)
	{
		this.name= name;
		this.salary =salary;
		
	}

	int getsalary()
	{
		return salary;
	}
}


class manager extends employee
{
	int incentive;
	manager()
	{
		super();
		incentive = 0;
		
	}

	manager(String n,int sal,int inc)
	{
		super(n,sal);
		incentive = inc;
	}
	
	int getsalary()
	{
		return (super.getsalary()+incentive);
	}
	
}
				
class labour extends employee
{
	int overtime;
	labour()
	{
		super();
		overtime = 0;
						
	}

	labour(String n,int sal,int ot)
	{
		super(n,sal);
		overtime = ot;
	}
					
	int getsalary()
	{
		return (super.getsalary()+overtime);
	}
					
}
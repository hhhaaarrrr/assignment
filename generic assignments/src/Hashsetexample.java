import java.util.*;
class Employee{
int id ,Salary;
String name,department;
public Employee(int id, String name,int Salary,String department) {
	this.id = id;
	this.name = name;
	this.Salary = Salary;
	this.department = department;
	}
}


public class Hashsetexample {

	public static void main(String[] args) {
		HashSet<Employee> set = new HashSet<Employee>();//set can be any variable u declare to store the data
		
		//creating employee details
		Employee e1 = new Employee(671,"varun",15000,"sales");
		Employee e2 = new Employee(681,"ravi",80000,"developer");
		Employee e3 = new Employee(651,"rool",40000,"testing");
		Employee e4 = new Employee(661,"seema",45000,"hr");
		
		//adding employees to hashset
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		System.out.println("Employee  <<class>>");
		
		for(Employee e:set) {
			//System.out.println(e);
			System.out.println(e.id+" "+e.name+" "+e.Salary+" "+e.department);
		}
	}
		
}		

	
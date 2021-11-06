import java.util.*;
public class employee {
private int ID;
private	String Name;
private	String department;
private int salary;
public employee(int iD, String name, String department, int salary) {
	super();
	ID = iD;
	Name = name;
	this.department = department;
	this.salary = salary;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String toString() {
	return "ID : "+this.ID+" Name : "+this.Name+" Deparment : "+this.department+" Salary : "+this.salary;
}

}
class MyIdComp implements Comparator<employee>{


	public int compare(employee o1, employee o2) {
		if(o1.getID()>o2.getID()) {
		return 1;
		}
		else
		{return -1;}
	}
}
class MyNameComp implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
class MyDeptComp implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return o1.getDepartment().compareTo(o2.getDepartment());
	}
	
}
class MySalaryComp implements Comparator<employee>{


	public int compare(employee o1, employee o2) {
		if(o1.getSalary()>o2.getSalary()) {
		return 1;
		}
		else
		{return -1;}
	}
}
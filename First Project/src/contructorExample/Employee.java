package contructorExample;

public class Employee {

	String empName;// 4 bytes
	String empId;
	String compName;
	String salary;
	
	
	
	
	

	// creating constrcutor

	public Employee(String empName, String empId, String compName, String salary) {
		this.empName = empName;
		this.empId = empId;
		this.compName = compName;
		this.salary = salary;

	}

	public static void main(String[] args) {

		Employee emp1 = new Employee("kalyan", "E1", "IBM", "12 lakhs");
		System.out.println(emp1.empName);

		System.out.println(emp1.empId);
		System.out.println(emp1.compName);
		System.out.println(emp1.salary);

		Employee emp2 = new Employee("sai santosh", "E2", "IBM", "15 lakhs");
		System.out.println(emp2.empName);
		System.out.println(emp2.empId);
		System.out.println(emp2.compName);
		System.out.println(emp2.salary);
	}

}

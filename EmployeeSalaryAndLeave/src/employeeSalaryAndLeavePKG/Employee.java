package employeeSalaryAndLeavePKG; // Declared a package

public abstract class Employee {                             // Declared an Abstract Class

	// declared variables for Emp ID, Emp Name, Total Leaves and Total Salary
	int empId;
	String empName;
	int totalLeaves;
	double totalSalary;
	
	Employee(int empId, String empName, int totalLeaves)         // Declared a parameterized constructor
	{
		this.empId = empId;                          // Assigning a local value to a global variable
		this.empName = empName;                      // Assigning a local value to a global variable
		this.totalLeaves = totalLeaves;              // Assigning a local value to a global variable
	}
	
	
	//Declared three abstract methods for Leave balance, Availing Leave and Calculating Leave.
	
	abstract void calculate_balance_leaves(); 
	
	abstract boolean avail_leave(int no_of_leaves, char type_of_leave); 
	
	abstract void calculate_salary();
}

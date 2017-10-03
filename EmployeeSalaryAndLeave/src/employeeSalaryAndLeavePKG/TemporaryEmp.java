package employeeSalaryAndLeavePKG;                     // Declared the package

public class TemporaryEmp extends Employee{                                 // Declared a class and extend a super class
	
	// Declared variables appliedLeave of int type and basic of double type
    int appliedLeave;
    double basic;
	
    TemporaryEmp(int empId, String empName,int totalLeaves,double basic)       // Using a parameterized constructor
	{
		super(empId,empName,totalLeaves);           // Calling a super class constructor
		this.basic = basic;                // Assigning a local value to a global variable
	}

    public void calculate_balance_leaves()                             // Overrriden method of a super class
	{
		int balanceLeaves = totalLeaves - appliedLeave;        // Calculating ramaining leaves
		System.out.println("************* LEAVE DETAILS *************");   // printing info
		System.out.println("Leaves Applied: " + appliedLeave);            // printing info
		System.out.println("Balance Leaves : " + balanceLeaves);            // printing info
	} 
    
    public boolean avail_leave(int numOfLeavesApplied, char typeOfLeave)   // Overrriden method of a super class
	{
		if(numOfLeavesApplied > totalLeaves)              // Checking a condition 
		{
			System.out.println("You can not Apply more than Total Leaves avaialable."); // printing info
			System.out.println();                                          // Printing a Blank line
			return false;                                               // Returning a boolean value false
		}
		else
		{
			appliedLeave = numOfLeavesApplied;           // Assigning leaves applied to a variable
			return true;                    // Returning a boolean value true
		}
	}
    
    public void calculate_salary()           // Overrriden method of a super class
	{
    	// Declared variables hra and pfa of double type
	   double hra;
	   double pfa; 
	   
	   // Calculating hra and pfa using basic
		hra = (basic * 50) / 100;
		pfa = (basic * 12) / 100;
		
		totalSalary = basic + hra - pfa;                // Calculating Total Salary
		
		System.out.println();                                            // Printing a Blank line
		System.out.println("************* SALARY DETAILS EXCLUDING PFA*************");       // Printing a info
		System.out.println("HRA            : "+hra);          // Printing a HRA
		System.out.println("PFA            : "+pfa);            // Printing a PFA
		System.out.println("Total Salary   : "+totalSalary);         // Printing a Totatl Salary
		System.out.println();                                            // Printing a Blank line
		
	}
}

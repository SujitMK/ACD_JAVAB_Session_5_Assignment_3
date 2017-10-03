package employeeSalaryAndLeavePKG;        // Package declared

import java.util.Scanner;                 // Using scanner utility

public class EmployeeSalaryAndLeave {             // Declared Class

	public static void main(String[] args) {               // Main method
		
		Scanner input = new Scanner(System.in);        // creating an object of a Scanner class

		System.out.println();                      // Printing a Blank line
		System.out.println("ENTER PERMANENT EMPLOYEE DETAILS");
		System.out.println();                             // Printing a Blank line
		
		System.out.println("Enter an Employee ID:");        // printing info
		int empId = input.nextInt();                               // taking a user input
		
		System.out.println("Enter an Employee Name:");          // printing info
		input.nextLine();                                         // To skip to take String value
		String empName = input.nextLine();                      // taking a user input
		
		String empType = "P";                    // Assigning a value
		
		System.out.println("Enter Total Leaves Available:");          // printing info
		int totalLeaves = input.nextInt();                 // taking a user input
		
		System.out.println("Enter Basic Salary:");                       // printing info
		int basic = input.nextInt();                // taking a user input
		
		System.out.println("Enter The No of Leaves You Want To Apply:");           // printing info
		int numOfLeavesApplied = input.nextInt();                    // taking a user input
		
		System.out.println("Enter The Type Of Leave. for Paid Leave: 'P', for Sick Leave: 'S' and for Casual Leave: 'C':");
		input.nextLine();                             // To skip to take String value
		char typeOfLeave = input.next().charAt(0);                // taking a user input
		
		
		
		System.out.println();                               // Printing a Blank line
		System.out.println("ENTER TEMPORARY EMPLOYEE DETAILS");   // printing info
		System.out.println();                                 // Printing a Blank line
		
		System.out.println("Enter an Employee ID:");           // printing info
		int empId1 = input.nextInt();                 // taking a user input
		
		System.out.println("Enter an Employee Name:");         // printing info
		input.nextLine();                           // To skip to take String value
		String empName1 = input.nextLine();          // taking a user input
		
		String empType1 = "P";
		
		System.out.println("Enter Total Leaves Available:");       // printing info
		int totalLeaves1 = input.nextInt();                   // taking a user input
		
		System.out.println("Enter Basic Salary:");           // printing info
		int basic1 = input.nextInt();                           // taking a user input
		
		System.out.println("Enter The No of Leaves You Want To Apply:");           // printing info
		int numOfLeavesApplied1 = input.nextInt();                      // taking a user input
		
		System.out.println("Enter The Type Of Leave. for Paid Leave: 'P', for Sick Leave: 'S' and for Casual Leave: 'C':");
		input.nextLine();                                           // To skip to take String value
		char typeOfLeave1 = input.next().charAt(0);                     // taking a user input
		
		System.out.println("********************************************************"); // printing info
        System.out.println("**  	        PERMANENT EMPLOYEE DETAILS            **"); // printing info
        System.out.println("********************************************************"); // printing info
		System.out.println("Employee ID : "+empId);                     // printing employee info
		System.out.println("Employee Name : "+empName);                        // printing employee info
		System.out.println("Employee Type : "+empType);                     // printing employee info
		System.out.println("Total  Leaves : "+totalLeaves);                // printing employee info
		System.out.println("Basic Salary : "+basic);                     // printing employee info

		PermanentEmp pe = new PermanentEmp(empId,empName,totalLeaves,basic); // Creating a object of permanent emp class
		pe.calculate_salary();     // Calling a method
		pe.print_leave_details(); // Calling a method
		pe.avail_leave(numOfLeavesApplied, typeOfLeave);     // Calling a method
		pe.calculate_balance_leaves(); // Calling a method
		
		System.out.println();                                      // Printing a Blank line
		System.out.println("********************************************************");    // printing  info
        System.out.println("**  	        TEMPORARY EMPLOYEE DETAILS            **");    // printing  info
        System.out.println("********************************************************");    // printing  info
		System.out.println("Employee ID : "+empId1);                    // printing employee info
		System.out.println("Employee Name : "+empName1);            // printing employee info
		System.out.println("Employee Type : "+empType1);               // printing employee info
		System.out.println("Total  Leaves : "+totalLeaves1);                // printing employee info
		System.out.println("Basic Salary : "+basic1);                         // printing employee info

		TemporaryEmp te = new TemporaryEmp(empId1,empName1,totalLeaves1,basic1);     // Creating a object of Temporary emp class
		te.calculate_salary();                              // Calling a method
		te.avail_leave(numOfLeavesApplied1, typeOfLeave1);      // Calling a method
		te.calculate_balance_leaves();         // Calling a method
				
	    input.close();         // Closing the scanner
	}

}

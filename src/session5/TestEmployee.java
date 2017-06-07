package session5;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PermanentEmp emp1 = new PermanentEmp(1, "Amritha", 15, 0, 15000, 2, 4, 8);
		// creating object instance for permanent employee class

		TemporaryEmp emp2 = new TemporaryEmp(2, "Tanaya", 12, 15000);
		// creating object instance for temporary employee class

		System.out.println("Employee Id: " + emp1.empId + "\n" + "Employee Name: " + emp1.empName + "\n"
				+ "Total leaves Allowed: " + emp1.total_leaves + "\n" + "Basic salary is " + emp1.basic);

		/**
		 * prints Employee Id: 1 
		 * Employee Name: Amritha 
		 * Total leaves Allowed: 15
		 * Basic salary is 15000.0
		 */

		emp1.print_leave_details();
		// calling print leave details method in permanent employee class

		emp1.avail_leave(5, 's');
		// calling available leave method in permanent employee class

		emp1.calculate_salary();
		// calling calculate salary method for permanent employee

		System.out.println("Employee Id: " + emp2.empId + "\n" + "Employee Name: " + emp2.empName + "\n"
				+ "Total leaves Allowed: " + emp2.total_leaves);

		/**
		 * Employee Id: 2 
		 * Employee Name: Tanaya 
		 * Total leaves Allowed: 12
		 */

		emp2.calculate_balance_leaves();
		// calling calculate balance leave method for temporary employee

		emp2.calculate_salary();
		// calling calculate salary method for temporary employee

	}

}

package employee;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee[] employee = new Employee[100];
		
		int count = 0;
		
		while(true) {
			System.out.println("---Employee Management System---");
			System.out.println("1. Add Manager");
			System.err.println("2. Add Developer");
			System.err.println("3. List Employees");
			System.err.println("4. Find Employee With Highest Salary");
			System.err.println("5. Exit");
			System.err.println("Choose an option:");
			
			int choice = sc.nextInt();
			sc.nextLine();  //consume newline
			
			switch(choice){
			case 1:	
				//create manager
				System.out.println("Enter name: ");
				String mName = sc.nextLine();
				System.out.println("Enter department: ");
				String mDepartment = sc.nextLine();
				System.out.println("Enter salary: ");
				double mSalary = sc.nextDouble();
				System.out.println("Enter bonus: ");
				double mBonus = sc.nextDouble();
				employee[count++] = new Manager(mName,mDepartment, mSalary, mBonus );
				break;
			case 2:
				//create developer
				System.out.println("Enter name: ");
				String dName = sc.nextLine();
				System.out.println("Enter department: ");
				String dDepartment = sc.nextLine();
				System.out.println("Enter salary: ");
				double dSalary = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter Language: ");
				double dLang = sc.nextDouble();
				employee[count++] = new Manager(dName,dDepartment, dSalary, dLang );
				break;
			case 3:
				//print employee
				System.out.println("---Employee List---");
				for(int i=0; i<=count; i++) {
					employee[i].displayInfo();
					System.out.println();
				}
				break;
			case 4:
				//find employee with highest salary
				if(count == 0) {
					System.out.println("No employee added yet.");
					break;
				}
				Employee highest = employee[0];
				for(int i=0; i<count; i++) {
					if(employee[i].getSalary()>highest.getSalary()) {
						highest = employee[i];
					}
				}
				System.out.println("---Employee with theHighest Salary");
				highest.displayInfo();
				break;
			case 5:
				System.out.println("Existing----Goodbye!");
				sc.close();
				return;
				default:
					System.out.println("Invalid option. Try again.");
			}
		}

	}

}

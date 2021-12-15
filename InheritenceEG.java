

	
	import java.util.Scanner;
	class Employeee
	{
	String name,address;
	int number,age,salary;
	public void printsalary()
	{
	System.out.println("Salary= "+salary);
	}
	public void display()
	{
	System.out.println("Name= "+name);
	System.out.println("Address= "+address);
	System.out.println("Number= "+number);
	System.out.println("Age= "+age);
	}
	}
	class Officer extends Employeee
	{
	String specialization;
	}
	class Manager extends Employeee
	{
	String department;
	}

	public class InheritenceEG
	{
	public static void main(String[] args)
	{
	Scanner S= new Scanner(System.in);
	Officer O=new Officer();
	Manager M=new Manager();
	System.out.println("Enter the name of officer: ");
	O.name=S.next();
	System.out.println("Enter the address of officer: ");
	O.address=S.next();
	System.out.println("Enter the phone number of officer: ");
	O.number=S.nextInt();
	System.out.println("Enter the age of officer: ");
	O.age=S.nextInt();
	System.out.println("Enter the salary of officer: ");
	O.salary=S.nextInt();
	System.out.println("Enter the specialization of officer: ");
	O.specialization=S.next();


	System.out.println("Enter the name of manager: ");
	M.name=S.next();
	System.out.println("Enter the address of manager: ");
	M.address=S.next();
	System.out.println("Enter the phone number of manager: ");
	M.number=S.nextInt();
	System.out.println("Enter the age of manager: ");
	M.age=S.nextInt();
	System.out.println("Enter the salary of manager: ");
	M.salary=S.nextInt();
	System.out.println("Enter the department of manger: ");
	M.department=S.next();

	System.out.println("\t\tDETAILS OF OFFICER");
	O.display();
	O.printsalary();
	System.out.println("Specialization= "+O.specialization);

	System.out.println("\t\tDETAILS OF MANAGER");
	M.display();
	M.printsalary();
	System.out.println("Department= "+M.department);
	}
	}

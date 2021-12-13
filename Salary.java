package basicprograms;

import java.util.Scanner;
class Employee
{
double salary=0;
double HRA=0;
double DA=0;
double gross=0;
public void display()
{
Scanner S= new Scanner(System.in);
System.out.println("Enter basic salary: ");
salary=S.nextDouble();
System.out.println("enter DA: ");
DA=S.nextDouble();
System.out.println("enter HRA: ");
HRA=S.nextDouble();
}
public void calcSalary()
{
HRA=(HRA*salary)/100;
DA=(DA*salary)/100;
gross=salary+HRA+DA;
System.out.println("Gross salary = " +gross);
}
}
class Engineer extends Employee
{}
public class Salary
{
public static void main(String[] args)
{
Engineer E=new Engineer();
E.display();
E.calcSalary();
}
}

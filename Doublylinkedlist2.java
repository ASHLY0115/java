





import java.util.ArrayList;
import java.util.Scanner;

public class  Doublylinkedlist2  {
public static void main(String [] args)
{
ArrayList<Integer> List = new ArrayList<>();
try (Scanner sc = new Scanner(System.in)) {
int op;
do
{
System.out.println("\t\tDoubly Linked List");
System.out.println("\t\t------------------\n\n");
System.out.println("1.Add element\n2.Delete element\n3.Exit");
System.out.println("Enter the desired option number : ");
op = sc.nextInt();
switch(op)
{
case 1:
System.out.println("Enter the no of elements to be inserted : ");
int num = sc.nextInt();
System.out.println("Enter the element(s) : ");
for(int i=0;i<num;i++)
{
int element = sc.nextInt();
if(List.add(element))
{
System.out.println("Element added successfully");
}
}
//printing list
System.out.println("The list is : ");
System.out.println(List);
System.out.println("----------------------------------------------");
break;

case 2:
System.out.println("Enter the element to be deleted : ");
int delelement = sc.nextInt();
for( int i =0; i< List.size();i++)
{
if(List.get(i) == delelement)
{
if(List.remove(i) != null)
{
System.out.println("Element deleted successfully");
}
break;
}
}
System.out.println("The list is : ");
System.out.println(List);
System.out.println("----------------------------------------------");
break;
case 3:
System.out.println("Thank you");
break;
}
}while(op!=3);
}
}
}

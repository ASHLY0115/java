/********************************************************************************
 * experiment no : 4
 * Description   : java program  to calculate area of different shapes namely,circle,rectangle and circle using concept of method overloading
 * Author        : Ashly Rose Antony
 * Date          : 29/11/2021
 * Version       : 1.0
 * ********************************************************************************/
package execises;

import java.util.Scanner;

public class Area {	
		

		public float area(float radius)
		{
		return 3.14f*radius*radius;
		}
		public int area(int length, int breadth)
		{
		return length*breadth;
		}
		public float area(float base,float height)
		{
		return 0.5f*base*height;
		}
		public static void main(String [] args)
		{
			
		Area area = new Area();
		Scanner sc = new Scanner(System.in);
		char ch;
		do
		{
			
			
		System.out.println("\t\tArea of Shapes");
		System.out.println("1.Circle\n2.Rectangle\n3.Triangle\n");
		System.out.println("Enter an option number : ");
		
		int option = sc.nextInt();
		switch(option)
		{
		case 1:
		System.out.print("Area of Circle\n");
		System.out.print("Enter the radius of the circle: ");
		float radius = sc.nextFloat();
		float circle = area.area(radius);
		System.out.println("Area = "+circle);
		break;
		
		case 2:
		System.out.print("Area of Rectangle\n");
		System.out.println("Enter the length : ");
		int length = sc.nextInt();
		System.out.println("Enter the breadth : ");
		int breadth = sc.nextInt();
		int rectangle = area.area(length,breadth);
		System.out.println("Area = "+rectangle);
		break;
		
		case 3:
		System.out.print("Area of Triangle\n");
		System.out.println("Enter the base : ");
		float base = sc.nextFloat();
		System.out.println("Enter the height: ");
		float height = sc.nextFloat();
		float triangle = area.area(base,height);
		System.out.println("Area = "+triangle);
		break;
		
		default:
		System.out.println("Error");
		break;
		
		}
		
		System.out.println("Do you want to continue ? Enter y or n");
		ch = sc.next().charAt(0);
		}while(ch == 'y');
		sc.close();
		}
		

	}



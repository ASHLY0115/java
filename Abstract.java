/********************************************
 * Description : Abstract class  experiment implementing shapes
 * Author : Ashly Rose Antony
 * Date : 13/12/21
 * Version : 1.0
 *******************************************/
import java.util.Scanner;
abstract class Shape
{
public void numberofSides()
{}
}
class Triangle extends Shape
{
public void numberofSides()
{
System.out.println("Triangle has 3 sides.");
}
}
class Rectangle extends Shape
{
public void numberofSides()
{
System.out.println("Rectangle has 4 sides.");
}
}
class Hexagon extends Shape
{
public void numberofSides()
{
System.out.println("Hexagon has 6 sides.");
}
}

public class Abstract
{
public static void main(String[] args)
{
Scanner Sc=new Scanner(System.in);
Triangle Tc= new Triangle();
Rectangle Rc= new Rectangle();
Hexagon Hc = new Hexagon();
Tc.numberofSides();
Rc.numberofSides();
Hc.numberofSides();
Sc.close();
}
}
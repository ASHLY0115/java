
import java.util.*;
abstract class Animal
{
int legs;
String name;
Animal(int legs)
{
this.legs = legs;
}
abstract void eat();
abstract void walk();

}

interface pet{
String getName();
void setName(String name);
void play();
}

class Spider extends Animal
{
Spider(int legs)
{
super(legs);
}
void walk()
{
System.out.println("Spider walk on "+legs+" legs");
}
void eat()
{
System.out.println("Spider eats insects.");
}
}

class Cat extends Animal implements pet
{

Cat (int legs, String name)
{
super(legs);
this.name = name;
}


public String getName()
{
return name;
}

@Override
public void setName(String name) {

this.name = name;
}

@Override
public void play()
{

System.out.println("Cat likes to play with a ball.");
}

void eat()
{
System.out.println("Cat eats fishes.");
}
void walk()
{
System.out.println("cat walk on "+legs+" legs");
}
}

class Fishs extends Animal implements pet{

Fishs(int legs,String name) {
super(legs);
this.name = name;

}

@Override
public String getName() {

return name;
}

@Override
public void setName(String name) {

this.name = name;
}

@Override
public void play() {
System.out.println("Fish likes to swim around.");
}

void eat() {
System.out.println("Fish eats plants.");
}
void walk()
{
System.out.println("Fish has no legs.");
}

}


public class InterfaceDemo{

public static void main(String[] args)
{
System.out.println("Spider");
Spider S = new Spider(8);
S.eat();
S.walk();

//Animal A = new Animal(4);

//Fish
System.out.println("Fish");
Fishs F = new Fishs(0,"Mimi");
System.out.println("This fish's name is "+F.getName());
F.eat();
F.walk();
F.setName("Momo");
System.out.println("This fish's name is "+F.getName()+"\n");

//Cat
System.out.println("Cat");
Cat C = new Cat(4,"Fluffy");
System.out.println("This cat's name is "+C.getName());
C.walk();
C.eat();
C.setName("Moose");
System.out.println("This Cat's name is "+C.getName()+"\n");

}

}




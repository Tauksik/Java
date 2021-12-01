import java.util.Scanner;
import java.lang.*;
abstract class Shape
{
int a,b;
Shape(int c,int d)
{
a=c;
b=d;
}
Shape(int c)
{
a=c;
}
void printArea()
{}
}
class Rectangle extends Shape
{
Rectangle(int a,int b)
{
super(a,b);
}
void printArea()
{
System.out.println("Area of Rectangle = "+(a*b)+" units");
}
}
class Triangle extends Shape
{
Triangle(int a,int b)
{
super(a,b);
}
void printArea()
{
System.out.println("Area of triangle = "+(float)(a*b/2)+" units");
}
}
class Circle extends Shape
{
Circle(int a)
{
super(a);
}
void printArea()
{
System.out.println("Area of Circle = "+(float)(3.142*a*a)+" units");
}
}
class Area
{
public static void main(String args[])
{
Rectangle r=new Rectangle(4,5);
Triangle t=new Triangle(5,4);
Circle c=new Circle(1);
r.printArea();
t.printArea();
c.printArea();
}
}

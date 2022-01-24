abstract class Shape
{
 protected double l;
 Shape(double l)
  {
   this.l=l;
  }
}
class Square extends Shape
{
  Square(double l)
  {
    super(l);
  }
  void area()
  {
   System.out.println("Area of square is "+(l*l));
  }
}
class Triangle extends Shape 
{
 private double b;
 Triangle(double l,double b)
 {
  super(l);
  this.b=b;
 }
 void area()
 {
 System.out.println("area of rectangle "+(l*b)/2);
 }
}
class Pentagon extends Shape
{
  Pentagon(double l)
  {
    super(l);
  }
  void area()
  {
   System.out.println("Area of Pentagon is "+(2.7*l*l));
  }
}
class Hexagon extends Shape
{
  Hexagon(double l)
  {
    super(l);
  }
  void area()
  {
   System.out.println("Area of square is "+(2.59*l*l));
  }
}
class Octagon extends Shape
{
  Octagon(double l)
  {
    super(l);
  }
  void area()
  {
   System.out.println("Area of square is "+(4.8*l*l));
  }
}
class Inherit 
{
 public static void main(String args[])
 {
  Square ob=new Square(5.5);
         ob.area();
  Triangle ob1=new Triangle(5.5,6);
         ob1.area();
  Pentagon ob2=new Pentagon(4);
           ob2.area();
  Hexagon ob3=new Hexagon(4);
           ob3.area();
  Octagon ob4=new Octagon(4);
           ob4.area();
 }
}
class Shape
{
 protected double l;
 Shape(double l);
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
  System.out.println("Area of sqaue:"+(l*l));
 }
}
class Triangle extends Shape
{
 int b;
 Triangle(double l,int b)
 {
   super(l);
   this.b=b;
 }
 void area()
 {
  System.out.println("Area of triangle:"+((l*b)/2));
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
  System.out.println("Area of pentagon:"+(2.72*l*l));
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
  System.out.println("Area of Hexagon:"+(2.59*l*l));
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
  System.out.println("Area of Octagon:"+(4.8*l*l));
 }
}
Class Inherit
{
 pubic static void main(String args[])
 {
  Square s1= new Square(5.5);
         s1.area();
  Triangle s2= new Triangle(3,4);
         s2.area();
  Pentagon s3= new Pentagon(4);
         s3.area();
  Hexagon s4= new Hexagon(4);
         s4.area();
  Octagon s5= new Octagon(4);
         s5.area();
  }
}

class Shape
{
 protected double d;
 Shape(double d)
 {
  this.d=d;
 }
}
class Circle extends Shape
{  
 final double PI=(double)22/7;
 Circle(double d)
 {
  super(d);
 }
 void area()
 {
 System.out.println("area of circle"+(PI*d*d));
 }
}

class Square  extends Shape
{
 Square(double d)
 {
  super(d);
 }
 void area()
 {
  System.out.println("area of square"+(d*d));
  }
}
class Sphere extends Shape
{
 final double PI=(double)22/7;
 Sphere(double d)
 {
  super(d);
 }
 void area()
 {
  System.out.println("area of Sphere"+(4*PI*d*d));
 }
}
class Cat1
{
 public static void main(String args[])
 {
  Circle c =new Circle(5);
         c.area();
  Square s=new Square(4);
         s.area();
  Sphere sp=new Sphere(5);
         sp.area();
 }
}
 
class Shape
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
   System.out.println("area of square="+(l*l));
  }
}
class Rect extends Square
{
 protected double b;
 Rect(double l,double b)
  {
    super(l);
    this.b=b;
   }
   void area()
  {
   System.out.println("area of square="+(l*b));
  }
}
class Main
{
 public static void main(String args[])
 {
  Sqaure s=new Sqaure(10);
         s.area();
  Rect r=new Rect(5.5,6);
        s.area();
  }
}
 
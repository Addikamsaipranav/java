public abstract class Shape {
    int dimension;
    public abstract Shape();
}

class Circle extends Shape
{
   Shape()
  {
    int area=3.14*r*r;;
    int circumstance=2*3.14*r*r;
  }
   void display()
  {
   System.out.println(area);
   System.out.println(circumstance);
  }
    
}
 
public class Cat
 {
    public static void main(String[] args)
       {
        int r=5;
        Circle Shape =new Shape(r);
          
        }
       
}
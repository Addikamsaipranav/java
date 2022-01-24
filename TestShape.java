abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}
class Rectangle extends Shape
 {
    private final double width, length; 
    public Rectangle(double width, double length) 
    {
        this.width = width;
        this.length = length;
    }
    public double area() 
    {
        return width * length;
    }
    public double perimeter() 
    {
       return 2 * (width + length);
    }

}
class Circle extends Shape
{
   int r;
   public Circle(int r)
    {
       this.r=r;
    }
    public double area()
    {
      return 3.14*r*r;
    }
    public double perimeter()
    {
      return 2*3.14*r*r;
    }
    
}
 
public class TestShape
 {
    public static void main(String[] args)
       {
        double width = 5, length = 7;
        int r=5;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");
        Shape Circle =new Circle(r);
           System.out.println("Circle radius:"+r+"\nResulting area :"+Circle.area()
            + "\nResulting perimeter: " + rectangle.perimeter() + "\n");
        }
       
}
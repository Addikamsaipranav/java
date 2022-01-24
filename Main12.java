class Base
{
 Base()
 {
 System.out.println("base default  construcor");
 }
}
class Super extends Base
{
 Super()
 {
 
  System.out.println("DC default constructor");
  }
}
class Main12
{
 public static void main(String args[])
 {
   Sub ob = new Sub();
        ob.disp();
        ob.display();
  Base ob1=new Base();
       ob1.disp();
  }
}
class Base1
{
 public void display()
  {
    System.out.println("base 1");
   }
}
class Base2
{
   public void display()
  {
    System.out.println("base 2 ");
   }
}
class Sub extends Base1,Base2
 {
   public static void main(String args[])
    {
      Sub o = new Sub();
          o.display();
     }
 }
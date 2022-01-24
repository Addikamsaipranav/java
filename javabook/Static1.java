class Test
{
  static int x=10;
  void display()
  {
   System.out.println(x);
   }
}
class Static1
{
 public static void main(String args[])
  {
    Test ob1,ob2;
         ob1=new Test();
         ob2=new Test();
         ++ob1.x; 
         System.out.println("x in o1:");
         ob1.display(); 
         System.out.println("x in o2:");
         ob2.display();
   }
}
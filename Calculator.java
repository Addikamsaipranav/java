
class Calculator
{
   public void add(int x, int y)
        {
          int c=x+y;
          System.out.println("addition is :"+c);
        }
   public void sub(int x1,int y1)
        {
          int c1=x1-y1;
          System.out.println("substraction  is :"+c1);
        }
   public void mul(int x2 ,int y2)
        {
          int c2=x2*y2;
           System.out.println("Multiplication  is :"+c2);
        }
   public void div(int x3 ,int y3)
        {
          int c3=x3/y3;
           System.out.println("division  is :"+c3);
        }
  public static void main(String args[])
     {
      int x,y,x1,y1,x2,y2,x3,y3;
       Calculator ob= new Calculator();
                  x=Integer.parseInt(args[0]);
                  y=Integer.parseInt(args[1]);
                  x1=Integer.parseInt(args[2]);
                  y1=Integer.parseInt(args[3]);
                  x2=Integer.parseInt(args[4]);
                  y2=Integer.parseInt(args[5]);
                  x3=Integer.parseInt(args[6]);
                  y3=Integer.parseInt(args[7]);
                  ob.add(x,y);
                  ob.sub(x1,y1);
                  ob.mul(x2,y2);
                  ob.div(x3,y3);
      }
}
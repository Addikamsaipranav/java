class Test3
{
  public void add(int a,int b,int c)
   {
     int d=a+b+c;
     System.out.println("additioon of a and b is :"+c);
   }
  public static void main(String args[])
    {
     int x,y,z;
     int len=args.length;
     System.out.println("lenght is :"+len);
     Test3 ob= new Test3();
     x=Integer.parseInt(arg[0]);
     y=Integer.parseInt(args[1]);
     z=Integer.parseInt(args[1]);
     ob.add(x,y,z);
     }
 }
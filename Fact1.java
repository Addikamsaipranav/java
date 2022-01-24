import java.io.*;
class Fact1
{
   static int f=1;
 public static void main(String args[]) throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter the number to find factorial");
  int x=Integer.parseInt(br.readLine()); 
  int res;
  
  Fact1 f=new Fact1();
       res= f.calFact(x);
    System.out.println(res);
  }
  int calFact(int x)
  {
    if(x>0)
    {
       f=f*x;
       calFact(x-1);
       return f;
     }
  }
}

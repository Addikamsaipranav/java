import java.io.*;
class New
{
 public static void main(String args[]) throws IOException
 {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   int num;
   int a[]= new int[3];
   System.out.println("enter a number");
   num=Integer.parseInt(br.readLine());
   for(int i=num;i>num;)
  {
   num=num%10;
System.out.println(num);
  }
 
   System.out.println(num);
 }
}
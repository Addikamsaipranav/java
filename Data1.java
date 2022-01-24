import java.io.*;
class Data1
{
 public static void main(String args[]) throws IOException
  {
   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
   int num;
   int a[]= new int[4];
   System.out.println("enter a 4 digit number:");
   num=Integer.parseInt(br.readLine());
   while(num!=0)
   {
     int digit=num%10;
     for(int i=0;i<=3;i++)
     {
      a[i]=digit;
     } 
   }
   for(int i=0;i<=3;i++)
   {
    System.out.println(i);
   }
  
  }
}
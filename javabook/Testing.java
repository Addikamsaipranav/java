import java.io.*;
import java.lang.Math; 
public class Testing 
{
  public static void main(String[] args) throws IOException 
{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int num,dc=0 ;
      double  t=0;
      System.out.println("enter a number");
      num=Integer.parseInt(br.readLine());
      int num1=num;
        while(num != 0) {
            dc=dc+1;
            num=num/10;
        }
    int a[]=new int[dc];
      for(int i=0;i<dc;i++)
      {
            a[i]=(((num1%10)+7)%10);
           num1=num1/10;
     }
 int c;
  c=a[0];
  a[0]=a[2];
  a[2]=c;
  c=a[1];
  a[1]=a[3];
  a[3]=c;

     for(int i=0;i<dc;i++)
    {
    double pow =Math.pow(10,i);
        t=t+(a[i]*pow);
    }
       
    System.out.println("encrypted code is :"+t);  
} 
}
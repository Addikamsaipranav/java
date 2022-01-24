import java.io.*;
import java.lang.Math; 
public class ReverseNumber 
{
  public static void main(String[] args) throws IOException 
{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int num,dc=0;
      double  t=0;
      System.out.println("enter a number");
      num=Integer.parseInt(br.readLine());
      int num1=num;
        while(num != 0) {
            dc=dc+1;
            num=num/10;
        }
      int a[]=new int[dc];
  
      for(int i=0;i<dc-1;i++)
      {
        a[i]=(((num1%10)+7)%10);
        num1=num1/10;
      }
      
   
     for(int i=0;i<dc;i++)
    {
      double pow =Math.pow(10,i);
      t=(int)t+(a[i]*pow);
    }
    System.out.println("encrypted code is :"+t);   
       
    
    
} 
}
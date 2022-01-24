import java.io.*;
class Polyndrome
{
  
  public static void main(String args[]) throws IOException
    {
     int n,temp,sum=0,r;
     BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter a number to check wheather it is a polyndrom or not a polyndrome");
     n=Integer.parseInt(br.readLine());
     temp=n;
     while(n>0)
       {
          r=n%10;
          sum=(sum*10)+r;
          n=n/10;
       }
       if(temp==sum)
          {
             System.out.println("yesss!!! its a polyndrome");
           }
       else
          {
            System.out.println("OOPs its not a polindrome");
          }
     }
 }
import java.io.*;
class Fact
{
 public static void main(String args[]) throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter the number to find factorial");
  int x=Integer.parseInt(br.readLine()); 
  int res=1;
  for(int i=x;i>0;i--)
 {
   res=res*i;
 }
 System.out.println("factorial="+res);   
 }
}

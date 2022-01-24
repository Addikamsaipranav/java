import java.io.*;
class Array3
{
 public static void main(String args[]) throws IOException
 {
  int a[]=new int[6];
  int b[]=new int[6],temp=0;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  for(int i=0;i<6;i++)
  {
   System.out.println("enter an element :");
   a[i]=Integer.parseInt(br.readLine());
   b[i]=Integer.parseInt(br.readLine());
  }
  for(int i=0;i<6;i++)
  {
   if(a[i]==b[i])
       temp=1;
   else  
       temp=0;
       System.out.println("array is not identical at a["+i+"] and b["+i+"]");
  }
  if(temp==0)
    System.out.println("2 arrays are identical");
  else 
    System.out.println("2 arrays are not identical");
 }
}
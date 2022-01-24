import java.io.*;
class Transpose1
{
 public static void main(String args[]) throws IOException
 {
  int a[]=new int[1];
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  for(int i=0;i<=1;i++)
  {
   System.out.println("enter an element :");
    for(int j=0;j<=1;j++)
   {
   a[i]=Integer.parseInt(br.readLine());
   }
  }
 System.out.println("array before transpose");
 for(int i=0;i<=1;i++)
  {
   for(int j=0;j<=1;j++)
   {
    System.out.println(a[i][j]+"\t");
   }
  System.out.println();
  }
 System.out.println("array aftertranspose");
  for(int i=0;i<=1;i++)
  {
   for(int j=0;j<=1;j++)
   {
    System.out.println(a[j][i]+"\t");
   }
  System.out.println();
  }
  
 }
}
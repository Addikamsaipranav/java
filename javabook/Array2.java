import java.io.*;
class Array2
{
 public static void main(String args[]) throws IOException
 {
  int a[]=new int[6];
  int b[]=new int[6];
  int c[]=new int[6];
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  for(int i=0;i<=6;i++)
  {
   System.out.println("enter an element :");
   a[i]=Integer.parseInt(br.readLine());
   b[i]=Integer.parseInt(br.readLine());
   c[i]=a[i]+b[i];
  }
  for(int i=0;i<=6;i++)
  {
   System.out.print(a[i]+"\t");
  }
  System.out.println();
  for(int i=0;i<=6;i++)
  {
   System.out.print(b[i]+"\t");
  }
  System.out.println();
  for(int i=0;i<=6;i++)
  {
   System.out.print(c[i]+"\t");
  }

  System.out.println(a.length);
 }
}
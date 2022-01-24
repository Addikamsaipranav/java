import java.io.*;
class Transpose
{
 public static void main(String args[]) throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int a[][]=new int[3][4];
       System.out.println("enter the elements of matrix:");
       
     for(int i=0;i<3;i++)
     for(int j=0;j<4;j++)
     a[i][j]=Integer.parseInt(br.readLine()); 
       
   System.out.println("transpose matrix:");
    for(int i=0;i<3;i++)
    {
    for(int j=0;j<4;j++)
   {
    System.out.print(a[j][i]+"  ");
   }
     System.out.println();
    }
  }
}
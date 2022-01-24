import java.io.*;

class Transpose
 {
 public static void main(String args[]) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter rows,columns");
    int r=Integer.parseInt(br.readLine());
    int c=Integer.parseInt(br.readLine());
   int arr[][]=new int[r][c];
   System.out.println("enter elements into matric");
   for(int i=0;i<r;i++)
   {
     for(int j=0;j<c;j++)
      {
        a[i][j]=Integer.parseInt(br.readLine());
        }
     }
  System.out.println("transpose is");
   for(int i=0;i<c;i++)
   {
     for(int j=0;j<r;j++)
    {
       System.out.print(arr[j][i]+" ");
    }
  System.out.println();
    }
  }
}
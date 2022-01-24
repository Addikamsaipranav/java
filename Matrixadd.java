import java.io.*;
class Matrixadd
 {
   public static void main(String args[]) throws IOException
   {
    int i,j;
    int a[][]=new int[2][2];
    int b[][]=new int[2][2];
    int c[][]=new int[2][2];
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   for(i=0;i<=1;i++)
    {
     for(j=0;j<=1;j++)
      {
        System.out.println("enter any element"  );
        a[i][j]=Integer.parseInt(br.readLine());
      }
    }
    for(i=0;i<=1;i++)
    {
     for(j=0;j<=1;j++)
      {
        System.out.println("enter any element");
        b[i][j]=Integer.parseInt(br.readLine());
      }
    }
   for(i=0;i<=1;i++)
    {
     for(j=0;j<=1;j++)
      {
       
        c[i][j]=a[i][j]+b[i][j];
      }
    }
   for(i=0;i<=1;i++)
    {
     for(j=0;j<=1;j++)
      {
        
        System.out.print("  "+c[i][j]);
      }
     System.out.println();
    }
  }
}
  
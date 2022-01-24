import java.io.*;
class Testpro
{
   public static void main(String args[]) throws IOException
  {
   
     int i,j,n;
    BufferedReader br = new BufferedReader( new InputStreamReader ( System.in ) );
    System.out.print("enter the no of employes you need to enter: ");
    n=Integer.parseInt(br.readLine());
   
  String[][] a = new String[n][4]; 
  int b[][]=new int[n][4];
  int total;
  int t[]=new int[n];
  

  for(i=0;i<n;i++)
   {
    for(j=0;j<4;j++)
     {
         if(i==0)
         {
          System.out.print("enter the meta data elemensts at column "+(j+1)+": ");
          a[i][j]=br.readLine();
          }
         
        else if(j==0 && i>0)
          {
           System.out.print("enter the employe names: ");
           a[i][j]=br.readLine();
          }
        else if(i>0 && j>0 && j<3){
            System.out.print("enter the absent days in "+a[0][j]+": ");
            b[i][j]=Integer.parseInt(br.readLine());
            }

     }
}
 for(i=1;i<n;i++)
 {
  for(j=1;j<3;j++)
  {
     total=total+b[i][j];
   }
   t[i]=total;
 }
   for(i=0;i<n;i++)
   {
    for(j=0;j<4;j++)
     {
         if(i==0)
         {
          System.out.print(a[i][j]+"\t"+" ");
         }
        else if(j==0 && i>0)
          {
           System.out.print(a[i][j]+"\t"+" ");
         
          }
        else if(i>0 && j>0 && j<3){
         System.out.print(b[i][j]+"\t"+" ");
            }
        else if(i>0 && j==3)
          {
            System.out.println(t[i]+"\t"+" ");
            }
  
   }
   System.out.println();
 }
}
}
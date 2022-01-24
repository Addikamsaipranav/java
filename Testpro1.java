import java.io.*;
class Testpro
{
   public static void main(String args[]) throws IOException
  {
    BufferedReader br = new BufferedReader( new InputStreamReader ( System.in ) );
    int x, i,j,n,m;
    System.out.print("enter the no of employes you need to enter: ");
    n=Integer.parseInt(br.readLine());
    System.out.print("how many months you need the enter: ");
    m=Integer.parseInt(br.readLine());
    String[][] a = new String[n][m+3]; 
    int b[][]=new int[n][m+3];
    int total=0;
    int t[]=new int[n+1];
   
    float per[] = new float[n+1];
     for(i=0;i<n;i++)
      {
        total=0;
        for(j=0;j<m+3;j++)
         {
           if(i==0){
            System.out.print("enter the meta data elements at "+(j+1)+"column");
            a[i][j]=br.readLine();
                 }
           else if(j==0 && i>0){
            System.out.print("enter the employe names: ");
            a[i][j]=br.readLine();
           }
           else if(i>0 && j>0 && j<=m+1){
             System.out.print("enter the absent days in "+a[0][j-1]+": ");
             b[i][j]=Integer.parseInt(br.readLine());
             total=total+b[i][j];
           }
            t[i]=total;
           per[i] = ((float)t[i]/200)*100;
        }
      }
                   
    
    for(i=0;i<n;i++)
    {
      for(j=0;j<m+3;j++)
      {
         if(i==0)
            System.out.print(a[i][j]+"\t"+" ");
         else if(j==0 && i>0)
            System.out.print(a[i][j]+"\t"+" ");
         else if(i>0 && j>0 && j<13)
            System.out.print(b[i][j]+"\t"+" ");
         else if(i>0 && j>m+1)
            System.out.print(t[i+1]+"\t"+" ");
         else if(i>0 && j==m+2)
           System.out.print(per[i+1]+"\t"+" ");
       
       }
       System.out.println();
    }
   
  }
}
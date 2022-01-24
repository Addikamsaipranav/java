import java.io.*;
class Metrics
{
   public static void main(String args[]) throws IOException
  {
    BufferedReader br = new BufferedReader( new InputStreamReader ( System.in ) );
    int i,j,n;
    System.out.print("enter the no of employes you need to enter: ");
    n=Integer.parseInt(br.readLine());
    System.out.println("Here you can find the absentism percentage of an employe in total year ");
    System.out.println("Here you have 15 columns you can enter you meta data elements ");
    System.out.println   ("------------------------------------------------------------------------------");

    String[][] a = new String[n+1][15]; 
    int b[][]=new int[n+1][15];
    int total=0;
    int t[]=new int[n+1];
   
    float per[] = new float[n+1];
     for(i=0;i<n+1;i++)
      {
        for(j=0;j<15;j++)
         {
           if(i==0){
            System.out.print("enter the meta data elements at  column "+(j+1)+": ");
            a[i][j]=br.readLine();
              }
           else if(j==0 && i>0){
            System.out.print("enter the employe names: ");
            a[i][j]=br.readLine();
           }
           else if(i>0 && j>1 && j<=13){
             System.out.print("enter the absent days in "+a[0][j-1]+": ");
             b[i][j-1]=Integer.parseInt(br.readLine());
           }
        }
      }
     for(i=1;i<n+1;i++)
    { 
        total=0;
         for(j=1;j<=13;j++)
        {
             total=total+b[i][j];
       }
          t[i]=total;
           per[i] = ((float)t[i]/200)*100;
      }
                   
    
    for(i=0;i<n+1;i++)
    {
      for(j=0;j<15;j++)
      {
         if(i==0)
            System.out.print(a[i][j]+"\t"+" ");
         else if(j==0 && i>0)
            System.out.print(a[i][j]+"\t"+" ");
         else if(i>0 && j>0 && j<13)
            System.out.print(b[i][j]+"\t"+" ");
         else if(i>0 && j==13)
            System.out.print(t[i]+"\t"+" ");
         else if(j==14 && i>0)
           System.out.print(per[i]+"\t"+" ");
       
       }
       System.out.println();
    }
   
  }
}

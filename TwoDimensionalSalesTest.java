import java.io.*;
class Testpro
{
   public static void main(String args[]) throws IOException
  {
   BufferedReader br = new BufferedReader( new InputStreamReader ( System.in ) );
     int i,j;
   String a[3][3] =new String[3][3];
   for(i=0;i<3;i++)
   {
    for(j=0;j<3;j++)
     {
         System.out.println("enter the elements");
         a[i][j]=br.readLine();

     }
  }
  for(i=0;i<3;i++)
   {
    for(j=0;j<3;j++)
     {
         System.out.println(a[i][j]+"\t");
         

     }
  }

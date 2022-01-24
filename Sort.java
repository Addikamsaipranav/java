import java.io.*;
class Sort
{
 public static void main(String args[]) throws IOException
  {
     
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int i,j,temp;
      int a[]=new int[10];
      for(i=0;i<10;i++)
       {
          System.out.println("Enter any number");
          a[i]=Integer.parseInt(br.readLine());
       }
      for(i=0;i<10;i++)
      {
       for(j=i+1;j<10;j++)
        {
           if(a[i]>a[j])
            {
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
            }
        }
     }
   System.out.println("after sort ");
    for(i=0;i<10;i++)
    {
       
       System.out.println(a[i]); 
     }
  }
}
import java.io.*;
class Smart1
{

 String s;
 int id;
 String a[]=new String[10];
 int b[]=new int[10];
    void Test()
    {
        for(int i=0;i<=9;i++)
        {
            System.out.println("enter name of student"+i);
            a[i]=br.readLine();
            System.out.println("enter student id"+i);
            b[i]=Integer.parseInt(br.readLine());
            
        }
        for(int i=0;i<=9;i++)
        {
         System.out.println(a[i]+" "+b[i]);
        }
        
    }
 public static void main(String args[]) throws IOException
  {
   BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        Smart1 t =new Smart1();
               t.test();
        
   }
}
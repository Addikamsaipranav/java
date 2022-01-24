import java.io.*;
class Test
{
 String s;
 int id;
 String a[]=new String[10];
 int b[]=new int[10];
    Test()
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

class Smart
{
 public static void main(String args[]) throws IOException
  {
  BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        Test t =new Test();
      }
        
   }
}
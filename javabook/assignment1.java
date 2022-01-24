import java.io.*;
class Testdetails
{
 int a[][]=new int[5][5];
 void storeMarks() throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     for(int i=0;i<5;i++)
      {
       System.out.println("enter the test:"+i);
       for(int j=0;j<5;j++)
        { System.out.println("student:"+j);
          a[i][j]=Integer.parseInt(br.readLine()); 
        }
      }
  }
 void display()
  {
    for(int i=0;i<5;i++)
     {
      System.out.print("  test:"+i);
      for(int j=0;j<5;j++)
      {
        System.out.print("         "+"student:"+j);      
        System.out.print(  a[i][j]+"  ");
      }
     System.out.println();
    }
  }
}
class assignment1
{
  public static void main(String args[]) throws IOException
  {
   Testdetails t =new Testdetails();
               t.storeMarks();
               t.display();
  }
}
          
 
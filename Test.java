import java.io.*;
class Test
{
 String s;
 int id;
 int a[]=new int[10];
 String b[]=new String[10];
 Test(String s,int id)
 {
  this.s=s;
  this.id=id;
  for(int i=0;i<=9;i++)
  {
   b[i]=s;
   a[i]=id;
  }
  
 }
class Test1 extends Test
{
  Test1()
  {
     Test();
     for(int i=0;i<=9;i++)
       {
         System.out.println(b[i]+" "+a[i]);
       }
   }
}
 
 public static void main(String args[]) throws IOException
  {
  BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
   String a;
   int b;
     for(int j=0;j<=9;j++)
     {
        System.out.println("enter name"+j+":");
        a=br.readLine();
        System.out.println("enter id"+j+":");
        b=Integer.parseInt(br.readLine());
        Test t =new Test(a,b);
        Test1 t1 =new Test1();
       
     }
  
   }
}
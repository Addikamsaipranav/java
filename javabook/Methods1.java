import java.io.*;
class Person
{
  String name;
  int age;
 public void accept() throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter any name:");
  name=br.readLine();
  System.out.println("enter age:");
  age=Integer.parseInt(br.readLine());
}
 void check()
 {
  if(age<30)
      System.out.println(name+"is young");
  else if(age<=50)
      System.out.println(name+"is middle age");
  else
     System.out.println(name+"is old");
 }
}
class Methods1
{
 public static void main(String args[]) throws IOException
 {
   Person p= new Person();
          p.accept(); 
          p.check();
          System.out.println("name is"+p.name);
          System.out.println("age is"+p.age); 
 }
} 

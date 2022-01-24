import java.io.*;
class Person
{
  String name;
  int age;
   Person(String s,int i)
 {
  name=s;
  age=i;
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
class CommandLinearguments
{
 public static void main(String args[]) throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String s=args[0];
   int i==Integer.parseInt(args[1]);
   Person p= new Person(s,i);
          p.check(); 
 }
} 

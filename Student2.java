import java.io.*;
class Student
{
 String name;
 int roll_no,phno;
 void getdata(String name,int roll_no,int phno)
 {
  this.name=name;
  this.roll_no=roll_no;
  this.phno=phno;
 }
 void display()
 {
  System.out.println("Student name :"+name);
  System.out.println("Student roll number:"+roll_no);
  System.out.println("Student phone number:"+phno);
 }
}
class Student2
 {
   public static void main(String args[]) throws IOException
  {
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
      String name;
      int roll_no,phno;
      System.out.println("enter the student name");
      name=br.readLine();
      System.out.println("enter the roll_no");
      roll_no=Integer.parseInt(br.readLine());
      System.out.println("enter the phone number");
      phno=Integer.parseInt(br.readLine());
      System.out.println("details of the student");
      Student ob =new Student();
              ob.getdata(name,roll_no,phno);
              ob.display();
      Student ob1 =new Student();
              ob1.getdata(name,roll_no,phno);
              ob1.display();
    
    }
}
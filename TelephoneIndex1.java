import java.util.*;
class TelephoneIndex1
{
 String name;
 String phno;
 TelephoneIndex1(String x1,String x2)
 {
   name=x1;
   phno=x2;
 }
 void input()
 {
  Scanner sa=new Scanner(System.in);
  System.out.println("enter your name");
  String s1=sa.next();
  System.out.println("enter your ph no");
  String s2=sa.next();
 }
 void display()
 {
  System.out.println("your output is:"+this.name);
  System.out.println("your output is:"+this.phno);
 }
 public static void main(String args[])
 {
   Scanner sa=new Scanner(System.in);
   TelephoneIndex t[]=new TelephoneIndex[5];
  for(int i=0;i<5;i++)
  {
   System.out.println("enter your name");
   String s1=sa.next();
   System.out.println("enter your ph num");
   String s2=sa.next();
   t[i]=new TelephoneIndex(s1,s2);
  }
 System.out.println("-------------------");
 System.out.println("first few chars of name to search? ");
		String ser = Sa.next();
		int serLength = ser.length();
		for(int i=0; i<t.length; i++)
		{

			if(t[i].getFirstNCharactersOfName(serLength).equals(ser))
			{
				t[i].display();
			}
		}
}
}
import java.util.*;
class Main
{
 String name;
 String phno;
 Main(String x1,String x2)
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
   Main ob[]=new Main[5];
  for(int i=0;i<5;i++)
  {
   System.out.println("enter your name");
   String s1=sa.next();
   System.out.println("enter your ph num");
   String s2=sa.next();
   ob[i]=new TelephoneIndex(s1,s2);
  }
 System.out.println("-------------------");
 System.out.println("first few chars of name to search? ");
		String ser = sa.next();
System.out.println("---------------------------");
		int queryLength = ser.length();
		for(int i=0; i<5; i++)
		{
			if(ob[i].getFirstNCharactersOfName(queryLength).equals(ser))
			{
				ob[i].display();
			}
		}
}
}
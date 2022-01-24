import java.util.Scanner;
class student
{
  private int id, marks[];
  private String name;
  public void readData()
  {
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter emp name: ");
   name = scan.nextLine();
   System.out.print("Enter  emp idno: ");
   id = scan.nextInt();
   marks = new int[4];
   for(int i = 0; i< 3; i++)
    {  
         String s;
          System.out.print("Enter month");
          s=scan.next();
         System.out.print("Enter"+s+" month the absentences day of emp of ");
         marks[i] = scan.nextInt();
         marks[3] += marks[i];
    }
}
static void sort(student [] s)
{
for(int i = 0; i < s.length-1; i++)
for(int j = i+1; j < s.length; j++)
if(s[j].marks[3] > s[i].marks[3])
{student temp = s[i];
s[i] = s[j];
s[j] = temp;
}
}
public void printData()
{
System.out.print("\n"+id+"\t");
System.out.print(name+"\t");
for(int i = 0; i < 4; i++)
System.out.print(marks[i]+"\t");
}
}
 
public class Main114
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.print("Enter no of employess: ");
int n = scan.nextInt();
student s[] = new student[n];
for(int i = 0; i < n; i++)
{
s[i] = new student();
s[i].readData();
}
System.out.println("eid     empname    jan      feb      mar");
student.sort(s); //static function call
for(int i = 0; i < n; i++)
s[i].printData();
}
}
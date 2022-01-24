import java.io.*;
interface Fees
{
 double showFees();
}
class CSE implements Fees
{
 public double showFees()
  {
    return 60000.000;
  }
}
class ECE implements Fees
{
  public double showFees()
  {
   return 55000.5; 
  }
}
class Coursefees
{
 public static Fees getFees(String course)
 {
 if(course.equalsIgnoreCase("CSE"))
        return new CSE();
 else if(course.equalsIgnoreCase("ECE"))
        return new ECE();
 else return null;
 }
}
class Myclass
{
 public static void main(String args[]) throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the course name");
  String name=br.readLine();
  Fees f=Coursefees.getFees(name);
  System.out.println("the fees is RS."+f.showFees());
 }
}
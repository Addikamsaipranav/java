import java.io.*;
class Leap
{
 public static void main(String args[]) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter thr year ");
    int Year=Integer.parseInt(br.readLine());
    if(Year%100==0 && year%400==0)
       system.out.println("Leap year");
    else if(year&100 !==0 && year%4==0)
       System.out.println("Leap year");
     else
        System.out.println("Not leap year");

  }
}
class Leap1
{
 public static void main(String args[])
 {
   int a=1904;
   if((a%400==0) || (a%4==0 && a%100!=0))
   {
       System.out.println("leap");
   }
   else
   {
     System.out.println("not leap");
   }
 }
}

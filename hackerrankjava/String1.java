import java.lang.*;
class Polyndrome
{
 public static boolean isPolindrome(String str) 
 {
  StringBuilder sb=new StringBuilder(str);
  sb.reverse();
  String rev=sb.toString();
  if(str.equals(rev));
      return true;
  else 
      return false;
 }
}
class Test
{
 public static void main(String args[])
 {
  System.out.println(Polyndrome.isPolindrome("nitin");
  System.out.println(Polyndrome.isPolindrome("nitinaa");
 }
}
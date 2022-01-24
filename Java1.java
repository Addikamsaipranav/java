import java.io.*;
class Strings
{ 
 public static void main(String args[]) throws IOException
 {
  String os="null";
  String a[]=new String[3];
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter the original String");
  os=br.readLine();
  for(int i=0;i<a.length;i++)
  {
    System.out.println("enter any String ");
    a[i]=br.readLine();
  }
  for(int i=0;i<a.length;i++)
     System.out.println(a[i]);
 }
}

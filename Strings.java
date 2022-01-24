import java.io.*;
class Strings
{ 
 public static void main(String args[]) throws IOException
 {
  char ch;
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
  { 
    int n=a[i].length();
    for(int j=0;j<n;j++)
     {
       ch=a[i].charAt(j);
     if(ch!='d'||ch!='i'||ch!='s'||ch!='t'||ch!='u'||ch!='r'||ch!='b'||ch!='a'||ch!='n'||ch!='c')
	  {
           System.out.println(a[i]);
          }
       }
   }

 }
}

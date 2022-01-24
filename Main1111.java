import java.io.*;
import java.lang.*;
class  Main1111
{
 public static void main(String args[]) throws IOException
 { 
  char ch;
  String s2;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String os="distribution";
   for(int i=0;i<4;i++)
  {
   System.out.println("enter string");
     String s1=br.readLine();
     int sum=0;
     int l=s1.length();
     for(int j=0;j<l;j++)
      {
       ch=s1.charAt(j);
       if(ch=='d'||ch=='i'||ch=='s'||ch=='t'||ch=='r'||ch=='i'||ch=='b'||ch=='u'||ch=='t'||ch=='i'||ch=='o'||ch=='n' )
       {
         sum=sum+1;
       }
      }
     if(sum<l)
    {
       System.out.println(s1+ "cannot be generated from disturbance");
    }
          
  }
 
 
 

}
}

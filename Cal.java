import java.io.*;
class Cal
{
 public static void main(String args[]) throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter the sysmbol which calculation you should do");
  String sym=br.readLine();
   int n1=30;
   int n2=20;
   int res;
   switch(sym)
   {
      case "+" :
                 res=n1+n2;
                 System.out.println("result"+res);
                 break;
      case "-" :
                 res=n1-n2;
                 System.out.println("result"+res);
                 break;
     case "*" :
                 res=n1*n2;
                 System.out.println("result"+res);
                 break;
     case "/" :
                 res=n1/n2;
                 System.out.println("result"+res);
                 break;
  }
 }
}

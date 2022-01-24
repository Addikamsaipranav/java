import java.io.*;
public class Main111 {
 public static void main(String[] args) throws IOException {
   String str="test string";
   char rc=' ',tc=' ';
   int pc=0,c=0;
   int i,j,l;
   l=str.length();
   for(i=0;i<l;i++)
   {
      tc=str.charAt(i);
       c=1;
     for(j=i+1;j<l;j++)
      {
        if(tc==str.charAt(j))
            {
               c++;
            }
       }
      if(pc<c)
       {
          rc=tc;
          pc=c;
        }
   }
  System.out.println(rc);
     
 }
}
import java.io.*;
class Filewriter
{
 public static void main(String args[]) throws IOException
 {
  BufferedReader br = new BufferedReader( new InputStreamReader ( System.in ) );
  String str;
  FileWriter fw=new FileWriter("E:\\java\\text.txt",true);
  System.out.println("enter data");
  while(!(str=br.readLine()).equals("exit"))
     fw.write(str+"\n");
     fw.close();
 }
}
  

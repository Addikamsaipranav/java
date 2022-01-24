import java.io.*;
class Filereader
{
public static void main(String args[]) throws IOException
{
  String str;
 
  FileReader fr=new FileReader("E:\\java\\text.txt");
  BufferedReader br=new BufferedReader(fr);
  while((str=br.readLine()) !=null)
    System.out.println(str);
    fr.close();
  }
}
import java.io.*;
class Ioredg
{
 public static void main(String args[]) throws IOException
 {
  BuufferedReader br=newBufferedReader(new InputStreamReader(Systemin));
  String s=br.readLine(); 
  FileInputStream fos=new FileOutputStream("f1.txt");
for(int i=0;i<s.length();i++)
    fos.write(s.charAt(i));
  fos.close();
 int c;
 boolean EOF=false;
  while(!EOF)
 {
  c=fis.read();
  if(c==-1)
     EOF=true;
  else
     System.out.println((char) c);   
  }
  fis.close();
 }
}
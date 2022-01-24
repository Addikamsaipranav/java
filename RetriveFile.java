import java.io.*;
class RetriveFile
{
 public static void main(String args[]) throws IOException
 
 {
   BufferedReader br = new BufferedReader( new InputStreamReader ( System.in ) );
  
   String fname=br.readLine();
   FileInputStream fis= null;
   try{
      fis=new FileInputStream(fname);
      }
 catch(FileNotFoundException fe){
   System.out.println("File not found");
   return;
}
 BufferedInputStream bin=new BufferedInputStream(fis);
  
   System.out.println("File content");
   int ch;
   while((ch=fis.read())!=-1)
    System.out.println((char)ch);
   bin.close();
 }
}
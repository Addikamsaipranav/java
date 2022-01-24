import java.io.*;
class ReadFile
{
 public static void main(String args[]) throws IOException{
   int ch;
    FileReader fr=null;
    try{
      fr = new FileReader("E:\\java\\fat.txt");
      }
    catch(FileNotFoundException fe){
       System.out.println("File not found");
     }
    while((ch=fr.read()) !=1)
     System.out.print((char)ch);
     fr.close();
    }
 } 
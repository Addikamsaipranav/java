import java.io.*;
import java.io.FileWriter;
public class WriteToFile1 {
   public static void main(String[] argv) throws Exception {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      FileWriter writer = new FileWriter("E:/java/fat1.txt");
      System.out.println("enter the no of voters");
      int n=Integer.parseInt(br.readLine());
      String str[]=new String[n];
      for(int i=0;i<n;i++)
      {
         System.out.println("Enter the your vote ,Please write your singer code");
          str[i]=br.readLine();
      }
      int len = str.length;
      for (int i = 0; i < len; i++) {
         writer.write(str[i] + "\t"+ "");
      }
      writer.close();
   }
}
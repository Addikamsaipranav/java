import java.io.*;
import java.net.*;
public class Ip
{
 public static void main(String args[]) throws IOException
 {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("enter the website name");
   String site=br.readLine();
   try{
     InetAddress hostInfo = InetAddress.getByName(site); 
    System.out.println("IP address: "+hostInfo);
   }
   catch(UnknownHostException ue){
                     System.out.println("website not found");
     }  
}
}
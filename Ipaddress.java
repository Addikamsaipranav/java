import java.io.*;
import java.net.*;
public class Ipaddress
{
 public static void main(String args[])
 {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("enter the website name");
   String site=br.readLine();
   try{
     InetAddress ip=new InetAddress.getByName(site);
    System.out.println("IP address: "+ip);
   }
   catch(UnknownHostException ue){
                     System.out.println("website not found");
     }  
}
}
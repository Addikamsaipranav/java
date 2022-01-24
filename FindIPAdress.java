import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.*; 
/**
 *
 * @author marifurr
 */
public class FindIPAdress {
 
    public static void main(String[] args) throws IOException{
 
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("enter the website name");
   String site=br.readLine();
        try {
            InetAddress hostInfo = InetAddress.getByName(site); 
            // Don't put https or https:// Just put the String only
            
            System.out.println("\nIP address of facebook is: " + hostInfo.getHostAddress());
            System.out.println("Host Name of facebook is : " + hostInfo.getHostName());
            
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
 
    }
 
}
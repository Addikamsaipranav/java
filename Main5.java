import java.io.*;
class Main5
{
   public static void main(String args[]) throws IOException
    {
     
     
     int small=0;
     int large=0;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       for( int i=1;i<=10;i++)
        {
          
          System.out.print("num"+i+":");
          int b=Integer.parseInt(br.readLine());
          if(b<small)
           {
             small=b;
            }
          else if(b>large)
            {
                large=b;
            }
     
         }  
       
          System.out.println("large:"+large+"small:"+small);

    }
}
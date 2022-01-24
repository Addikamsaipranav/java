  import java.io.*;
    class filesinputoutput
    {
        public static void main(String args[])
        {
            InputStream obj = new FileInputStream("inputoutput.java");
            System.out.print(obj.available());
        }
    }
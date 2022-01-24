class Emp1

{

        public static void main ( String args[] )

        throws IOException

        {

                BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
                
                String md[]=new String[9];
                for(int i=1;i<9;i++)
                { 
                  System.out.println("enter the meta data of the table at column :"+i+1);
                  md[i]=br.readLine();
                }
                for(int i=0;i<9;i++)
             {
                  System.out.print(md[i] + "\t");
             }
        }
}

import java.io.*;
class Emp1

{

        public static void main ( String args[] )throws IOException

        {

                BufferedReader br = new BufferedReader( new InputStreamReader ( System.in ) );
                
                String md[]=new String[9];
                for(int i=0;i<9;i++)
                { 
                  System.out.println("enter the meta data of the table at column :"+i);
                  md[i]=br.readLine();
                }       
                System.out.print("\n\nEnter no. of emp : ");

                int n = Integer.parseInt ( br.readLine() );

                String name[] = new String[n];

                String div[] = new String[n];

                int sub[][] = new int[n][6];

                int total[] = new int [n];

                float per[] = new float[n];

                for ( int i=0 ; i<n ; i++ )

                {

                        System.out.println("\n\nEnter details of employe " + (i+1) + " -\n");

                        System.out.print("\nEnter name : ");

                        name[i] = br.readLine();

                        System.out.println("\n\nEnter no of absent days -\n");

                        System.out.print("\njan");

                        sub[i][0] = Integer.parseInt ( br.readLine() );

                        System.out.print("\nfeb");

                        sub[i][1] = Integer.parseInt ( br.readLine() );
                                                 
                        System.out.print("\nmarch");

                        sub[i][2] = Integer.parseInt ( br.readLine() );

                        System.out.print("\napril");

                        sub[i][3] = Integer.parseInt ( br.readLine() );

                        System.out.print("\nmay");

                        sub[i][4] = Integer.parseInt ( br.readLine() );

                        System.out.print("\njune");

                        sub[i][5] = Integer.parseInt ( br.readLine() );

                        for ( int j=0 ; j<6 ; j++ )

                                total[i] += sub[i][j];

                        per[i] = ((float)total[i]/200)*100;

                        

                }
             for(int i=0;i<9;i++)
             {
                  System.out.print(md[i] + "\t");
             }

                for ( int i=0 ; i<n ; i++ )

                {

                        System.out.print(name[i] + "\t");

                        System.out.print(sub[i][0] + "\t");

                        System.out.print(sub[i][1] + "\t");

                        System.out.print(sub[i][2] + "\t");                      

                        System.out.print(sub[i][3] + "\t");                      

                        System.out.print(sub[i][4] + "\t");

                        System.out.print(sub[i][5] + "\t");

                        System.out.print(total[i] + "\t");

                        System.out.print(per[i] + "\t");

                        System.out.print(div[i] + "\t");

                        System.out.println("\n");

                }

        }

}
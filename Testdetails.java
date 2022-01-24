import java.io.*;
class Testdetails
{
 
  void displayMarks();
  {
     for(int i=0;i<25;i++)
     {
       System.out.println("marks of Student"+i);
        for(int j=0;j<7;j++)
          {
            System.out.println(a[i][j]+"\t");
           }
      }
  }
 public static void main(String args[]) throws IOException
  { 
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     float a[][]=new float[25][7];
     void storeMarks()
  {
    for(int  i=0;i<25;i++)
      {
        System.out.println("Enter marks of Student"+i);
          for(int j=0;j<7;j++)
           {   
             a[i][j]=Float.parse(br.readLine());   
           }
       }
  }
       Testdetails td =new Testdetails();
                   td.storeMarks();
                   td.displayMarks();
       NoticePeriod np =new NoticePeriod();
                    np.getNotice();
  }
}
class NoticePeriod extends Testdetails
 {
   
   void getNotice()
   {
     storeMarks();
     for(int i=0;i<25;i++)
      {  
         int tests=0;
         int tmarks=0;
          for(int j=0;j<7;j++)
           {
             tmarks=tmarks+a[i][j];
             if(a[i][j]!=0)
                 tests++;
            }
           if(test<3 && tmarks<50)
           {
             System.out.println((i+1)+"has noticed");
           }      
       }
    }
 
}
   


       
 
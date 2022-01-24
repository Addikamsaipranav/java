import java.io.*;
class Testdetails
{
 float a[][]=new float[25][7];
 public void storeMarks()
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
 public void displayMarks();
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
}
class NoticePeriod extends Testdetails
 {
   
   public void getNotice()
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
 public static void main(String args[]) throws IOException
  { 
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Testdetails td =new Testdetails();
                   td.storeMarks();
       NoticePeriod np =new NoticePeriod();
                    np.getNotice();
  }
}
   


       
 
import java.io.*;
public class prog {

    public static void main(String[] args) throws IOException {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
      int a[][]=new int[6][6];
      int pnt;
      int st;
     for(int i=0;i<=5;i++)
     { 
      if(i<=4)
        System.out.println(" Now we are getting details of product no "+(i+1));
      for(int j=0;j<=5;j++)
      {  if(j<=3 && i<=4){
          System.out.print("enter the no of products that are sailed by sales person"+ (j+1)+": ");
        a[i][j+1]=Integer.parseInt(br.readLine());}          
      }
     }
     for(int i=0;i<=4;i++)
    {
       pnt=0;
       st=0;
      for(int j=0;j<=3;j++)
    {
       if(j<=3 && i<=4){
         pnt=pnt+a[i][j+1];
         a[i][5]=pnt;}
       if(i<=4){
          st=st+a[j][i+1];
         a[5][i]=st;}
    }
   }
  
    for(int i=0;i<=5;i++)
    {
      if(i<=4)
      System.out.print("product "+(i+1)+"\t"+" ");
      if(i==5)
        System.out.print("Total "+"\t"+" "+"\t"+" ");
      for(int j=1;j<=5;j++)
    {  
       if(i<=4)
       System.out.print(a[i][j]+"\t"+" ");
       if(i==5)
        System.out.print(a[i][j]+"\t"+" ");
    }
     System.out.println();
   }
  }
    
        
}
        

    
    
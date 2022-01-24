import java.io.*;
class Matrix
{
 int r,c;
 int a[][];
 int b[][];
 int d[][];
 
 void getdata(int r,int c)
 {
  this.r=r;
  this.c=c;
  a=new int[r][c];
  b=new int[r][c];
  d=new int[r][c];
 }
  
 void getMatrix() throws IOException
 {
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("now lets enter the 1st array elements ");
   for(int i=0;i<r;i++)
   {
     for(int j=0;j<c;j++)
   {
      System.out.println("enter the element at row "+(i+1)+"and column "+(j+1));
      a[i][j]=Integer.parseInt(br.readLine());
    }
   }
   System.out.println("now lets enter the 2nd array elements ");
    for(int i=0;i<r;i++)
   {
     for(int j=0;j<c;j++)
   {
      System.out.println("enter the element at row  "+(i+1)+"and column  "+(j+1));
      b[i][j]=Integer.parseInt(br.readLine());
    }
   }
  }
  void cal()
 {
  for(int i=0;i<r;i++)
   {
     for(int j=0;j<c;j++)
    {
     d[i][j]=a[i][j]+b[i][j];
    }
   }
  }
  void display()
  {
   System.out.println("first array elements:");
   for(int i=0;i<r;i++)
   {
     for(int j=0;j<c;j++)
   {
      System.out.print(a[i][j]+"  ");
    }
    System.out.println();
   }
   System.out.println("Second array elements:");
   for(int i=0;i<r;i++)
   {
     for(int j=0;j<c;j++)
   {
      System.out.print(b[i][j]+"  ");
    }
    System.out.println();
   }
  System.out.println("sum array elements:");
   
  for(int i=0;i<r;i++)
   {
     for(int j=0;j<c;j++)
   {
      System.out.print(d[i][j]+"  ");
    }
      System.out.println();
   }
 }
}
class Multi extends Matrix
{
 int m[][]=new int[r][c];
 void cal()
 {
  for(int i=0;i<r;i++)
   {
     for(int j=0;j<c;j++)
   {
      m[i][j]=a[i][0]*b[0][j]+a[i][1]*b[1][j];
    }
      
   }
   void display1()
  {
   System.out.println("Multiplication array elements:");
   for(int i=0;i<r;i++)
   {
     for(int j=0;j<c;j++)
   {
      System.out.print(m[i][j]+"  ");
    }
    System.out.println();
   }
   }
 }
 
  
}

 class Add
 {
  public static void main(String args[]) throws IOException
  {
    Matrix ob=new Matrix();
           ob.getdata(3,3);
           ob.getMatrix();
           ob.cal();
           ob.display();
   Multi ob1=new Multi();
         ob1.cal();
         ob1.display1();
  }
 }
   
 
   
 
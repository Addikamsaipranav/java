import java.io.*;
class Matrix
{
 int r,c;
 int a[][];
 int b[][];
 int c[][];
 void getdata(int r,int c)
 {
  this.r=r;
  this.c=c;
  a=new int[r][c];
  b=new int[r][c];
  c=new int[r][c];
 }
  
 void getMatrix() throws IOException
 {
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("now lets enter the 1st array elements ");
   for(int i=0;i<r;i++)
   {
     for(int j=0;j<c;j++)
   {
      System.out.println("enter the element at row :"+(i+1)+"and column :"+(j+1));
      a[i][j]=Integer.parseInt(br.readLine());
    }
   }
   System.out.println("now lets enter the 2nd array elements ");
    for(int i=0;i<r;i++)
   {
     for(int j=0;j<c;j++)
   {
      System.out.println("enter the element at row :"+(i+1)+"and column :"+(j+1));
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
     c[i][j]=a[i][j]+b[i][j];
    }
   }
  }
  void dispay()
  {
   System.out.println("first array elements:");
   for(int i=0;i<r;i++)
   {
     for(int j=0;j<c;j++)
   {
      System.out.println(a[i][j]+"/t");
    }
   }
   for(int i=0;i<r;i++)
   {
     for(int j=0;j<c;j++)
   {
      System.out.println(b[i][j]+"/t");
    }
   }
   
  for(int i=0;i<r;i++)
   {
     for(int j=0;j<c;j++)
   {
      System.out.println(c[i][j]+"/t");
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
  }
 }
   
 
   
 
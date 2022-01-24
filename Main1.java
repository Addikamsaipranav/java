class Main1
{
   public static void main(String args[])
    {
       int i,j,k; 
       for(i=6;i>0;i--)
        {
          for(j=1;j<i;j++)
            {
              System.out.print(j);
            }
          for(k=6;k>=i;k--)
            {
              System.out.print("&");
            }
        System.out.println();
         }
     }
}
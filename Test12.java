import java.io.*;
class Data
{
 public static void main(String args[]) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     Int i;
     System.out.println("enter a four digit number");
     i=Integer.parseInt(br.readLine();
     long r,num,temp,sum=0,i,temp_sum=0;
     while(num!=0){
     r=num%10;
     temp=r+1;
     if(temp==10)
     temp=0;
    num=num/10;
   sum=(sum*10)+temp;

  }

   while(sum!=0){
   i=sum%10;
   sum=sum/10;
   temp_sum=(temp_sum*10)+i;
   }
 System.out.println(temp_sum);
}
}
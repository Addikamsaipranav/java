import java.io.*;
class Array1
{
 public static void main(String args[]) throws IOException
 {
  int arr[]=new arr[6];
  int os=0,es=0;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  for(int i=0;i<=6;i++)
  {
   System.out.println("enter an element:");
   a[i]=Integer.parseInt(br.readLine());
   if(i%2==0)
   {
     es=es+a[i];
   }
   else
   {
     os=os+a[i]
    }
  }
 System.out.println("even sum :"+es);
 System.out.println("odd sum:"+os);
 }
}
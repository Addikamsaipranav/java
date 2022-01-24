class Check
{
 void swap(int x,int y)
 {
  int temp;
  temp=x;
  x=y;
  y=temp;
   System.out.println(x+"\t"+y);
 }
}
class Pass
{
 public static void main(String args[])
 {
 int x=10,y=20;
 Check ob=new Check();
    System.out.println(x+"\t"+y);
       ob.swap(x,y); 
   
 }
}
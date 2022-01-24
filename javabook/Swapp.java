class Employ
{
 int id1,id2;
 Employ(int id1,int id2)
  {
    this.id1=id1;
    this.id2=id2;
  }
}
class Check
{
 void Swap(Employ a)
  {
    int temp;
    temp=a.id1;
    a.id1=a.id2;
    a.id2=temp;
  }
}
class Swapp
{
 public static void main(String args[])
 {
 int id1=10,id2=20;
  Employ o1=new Employ(id1,id2);
  System.out.println(o1.id1+"\t"+o1.id2);
  Check o=new Check();
        o.Swap(o1);
   
   System.out.println(o1.id1+"\t"+o1.id2);
  }
}
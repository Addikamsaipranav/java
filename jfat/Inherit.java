class Box{
 double width;
 double height;
 double depth;
 Box(Box ob)
 {
  width = ob.width;
  height= ob.height;
  depth =ob.depth;
 }
 Box(double w,double h,double d)
 {
  width = w;
  height= h;
  depth = d;
  }
 Box()
 {
  width=-1;
  height=-1;
  depth=-1; 
  }
 Box(double len)
 {
  width=height=depth=len;
 }
 double volume()
 {
 return width*height*depth;
 }
}
class Boxweight extends Box{
  double weight;
 Boxweight(double w,double h,double d,double m){
 width=w;
 height=h;
 depth=d;
 weight=m;
 }
}
class Inherit{
 public static void main(String args[])
 {
  Boxweight ob1=new Boxweight(10,20,15,34.3);
  Box ob2 =new Box();
  double vol;
  vol=ob1.volume();
  
  System.out.println(vol);
  System.out.println();
  ob2=ob1;
  vol=ob2.volume();
  System.out.println(vol);
  
 }}
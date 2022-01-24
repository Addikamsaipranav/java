class Box{
 double width;
 double height;
 double depth;
 double volume(){
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
class InheritCopy{
 public static void main(String args[])
 {
  Boxweight ob1=new Boxweight(10,20,15,34.3);
  Boxweight ob2=new Boxweight(2,3,4,0.076);
  double vol;
  vol=ob1.volume();
  
  System.out.println(vol);
  vol=ob2.volume();
  System.out.println(vol);
 }}
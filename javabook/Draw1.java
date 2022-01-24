import java.awt.*;
import java.awt.event.*;
class Draw11 extends Frame
{
 class Myclass implements WindowListener
{
  public void windowClosinng(WindowEvent e)
   {
    System.exit(0);
   }
}
@Override 
public void paint(Graphics gg)
 {
  
  gg.setColor(Color.blue);
  gg.drawRect(40,40,200,200);
  gg.drawOval(90,70,80,80);
  gg.drawOval(110,95,5,5);
  gg.drawOval(145,95,5,5);
  gg.drawLine(130,95,130,115);
  gg.drawArc(113,115,35,20,0,-180);
 }
}
class Draw1{
public static void main(String args[])
{
 Draw11 d=new Draw11();
        d.setSize(400,400);
        d.setTitle("my drawing");
        d.setVisible(true);
        d.addWindowListener(new Myclass());
 }
}
import java.awt.*;
import java.awt.event.*;
class Draw1 extends Frame
{
 Draw1()
 {
  setSize(500,500);
  setTitle("My drawing");
  setVisible(true);
  addWindowListener(new WindowAdapter()
 {
  public void windowClosing(WindowAdapter we)
  {
   System.exit(0);
  }
 });
 }
 
 public void paint(Graphics g)
 {
  g.setColor(Color.blue);
  g.setdrawRect(40,40,200,200);
  g.setdrawOval(110,95,5,5);
  g.setdrawLine(130,95,130,115);
  g.setdrawArc(113,115,35,20,0,-180);
 }
}
class Draw11
{
 public static void main(String args[])
 {
  Draw1 d =new Draw1();
  }
}
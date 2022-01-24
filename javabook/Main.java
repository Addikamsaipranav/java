import java.awt.*;
import java.awt.event.*;
class Draw2 extends Frame
{
 Draw2()
 {
      
      this.addWindowListener(new WindowAdapter()
        {
          public void windowClosing(WindowEvent we)
         {
          System.exit(0);
         }
        });
  }    

public void paint(Graphics g)
 {

    g.fillRect(40,40,200,200);
    g.drawOval(110,95,5,5);
    g.drawLine(130,95,130,115);
    g.drawArc(113,115,35,20,0,-180);
 }
}
class Main
{
public static void main(String args[])
{
 Draw2 d=new Draw2();
       d.setSize(400,400);
        d.setTitle("aaa");
      d.setVisible(true);
       
 }
}
 
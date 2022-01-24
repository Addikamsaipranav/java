import java.awt.*;
import java.awt.event.*;
class Draw2 extends Frame
{
         setSize(400,400);
         setTitle("aaa");
         setVisible(true);
         addWindowListener(new WindowAdapter()
          {
          public void windowClosing(WindowEvent we)
         {
          System.exit(0);
         }
        });

 public void paint(Graphics g)
 {
     setColor(color.blue);
     fillRect(40,40,200,200);
 }
}
class Main
{
public static void main(String args[])
{
 Draw2 d=new Draw2();
       
 }
}
 
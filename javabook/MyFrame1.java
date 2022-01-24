import java.awt.*;
import java.awt.event.*;
class MyFrame1 extends Frame
{
 public static void main(String args[])
 {
 
  MyFrame1 f=new MyFrame1("my awt frame");
          f.setSize(300,250); 
          f.setVisible(true);
          f.addWindowListener(new Class1());
 }
}
class Class1 implements WindowListener
{
 public void windowClosing(WindowEvent e)
  {
   System.exit(0);
  }
}
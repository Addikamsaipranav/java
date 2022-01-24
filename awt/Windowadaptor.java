import java.awt.*;
import java.awt.event.*;
class Windowlistenerim extends WindowAdapter //listener implementation
{
 
 public void windowClosing(WindowEvent we)
 {
 System.out.println("Window c losing");
 System.exit(0);//terminating prog
 }
}
class MyFrame extends Frame//creation of container 
{
 MyFrame()
 {
   this.setSize(500,500);
   this.setVisible(true);
   this.setTitle("window events ex");
   this.setBackground(Color .green);
   this.addWindowListener(new Windowlistenerim());//attaching listener to gui component.
 }
}
class Windowadaptor
{
 public static void main(String args[])
 {
  MyFrame m =new MyFrame();
 }
}
 
 
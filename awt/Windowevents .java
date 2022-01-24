import java.awt.*;
import java.awt.event.*;
class Windowlistenerim implements WindowListener 
{
 public void windowOpened(WindowEvent we)
 {
 System.out.println("Window opened");
 }
 public void windowClosed(WindowEvent we)
 {
 System.out.println("Window closed");
 }
 public void windowClosing(WindowEvent we)
 {
 System.out.println("Window closing");
 System.exit(0);//terminating prog
 }
 public void windowIconified(WindowEvent we)
 {
 System.out.println("Window Iconified");
 }
 public void windowDeiconified(WindowEvent we)
 {
 System.out.println("Window diCnified");
 }
 public void windowActivated(WindowEvent we)
 {
 System.out.println("Window activated");
 }
 public void windowDeactivated(WindowEvent we)
 {
 System.out.println("Window deactivated");
 }
 
}
class MyFrame extends Frame
{
 MyFrame()
 {
   this.setSize(500,500);
   this.setVisible(true);
   this.setTitle("window events ex");
   this.setBackground(Color .green);
   this.addWindowListener(new Windowlistenerim());
 }
}
class Windowevents 
{
 public static void main(String args[])
 {
  MyFrame m =new MyFrame();
 }
}
 
 
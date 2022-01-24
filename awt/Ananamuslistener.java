import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame//creation of container 
{
 MyFrame()
 {
   this.setSize(500,500);
   this.setVisible(true);
   this.setTitle("window events ex");
   this.setBackground(Color .green);
   this.addWindowListener(new WindowAdapter()
    {
     public void windowClosing(WindowEvent we)
      {
        System.exit(0);
      }

     });//attaching listener to gui component.
 }
}
class Ananamuslistener
{
 public static void main(String args[])
 {
  MyFrame m =new MyFrame();
 }
}
 
 
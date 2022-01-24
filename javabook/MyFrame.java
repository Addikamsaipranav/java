import java.awt.*;

import java.awt.event.*;
class MyFrame extends Frame
{
 public static void main(String args[])
 {
  
  MyFrame f = new MyFrame();
          f.setTitle("my awt frame");
          f.setSize(300,250); 
          f.setVisible(true);
          f.addWindowListener(new WindowAdapter()
           {
              public void windowClosingg(WindowEvent e)
                {
                  System.exit(0); 
                }
        
            });
}
}
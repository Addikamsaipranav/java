import java.awt.*;
import java.awt.event.*;
class KeyListenerImpl implements KeyListener
{
 public void keyPressed(KeyEvent ke)
 {
  System.out.println("key pressed :"+ke.getKeyChar());
 }
 public void keyReleased(KeyEvent ke)
 {
  System.out.println("key released :"+ke.getKeyChar());
 } 
 public void keyTyped(KeyEvent ke)
 {
  System.out.println("key Tyoed :"+ke.getKeyChar());
 }
}
class MyFrame extends Frame
{
 MyFrame()
 {
  setTitle("my key");
  setSize(500,500);
  setVisible(true);
  setBackground(Color .green);
  addKeyListener(new KeyListenerImpl());
 }
}
class KeyEventsEx
{
 public static void main(String args[])
 {
  MyFrame f =new MyFrame();
 }
}

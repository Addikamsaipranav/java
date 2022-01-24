import java.awt.*;
import java.awt.event.*;
class Key implements MouseListener
{
 public void mouseClicked(MouseEvent me)
 {
  System.out.println("Mouse clicked["+me.getX()+","+me.getY()+"]");// it will return the axis of x and y 
 }
 public void mousePressed(MouseEvent me)
 {
  System.out.println("Mouse pressed["+me.getX()+","+me.getY()+"]");
 }
public void mouseReleased(MouseEvent me)
 {
  System.out.println("Mouse Released["+me.getX()+","+me.getY()+"]");
 }
public void mouseEntered(MouseEvent me)
 {
  System.out.println("MouseEntered["+me.getX()+","+me.getY()+"]");
 }
public void mouseExited(MouseEvent me)
 {
  System.out.println("Mouseexited["+me.getX()+","+me.getY()+"]");
 }
}
class MyFrame extends Frame
{
 MyFrame()
 {
  setSize(500,550);
  setVisible(true);
  setTitle("mouse events");
  setBackground(Color .blue);
  addMouseListener(new Key());
 }
}
class MouseEvents 
{
 public static void main(String args[])
 {
  MyFrame f= new MyFrame();
 }
}
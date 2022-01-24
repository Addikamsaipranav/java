import java.awt.*;
class MyFrame extends Frame
{
 MyFrame()
 {
        this.setVisible(true);
        this.setSize(500,500);
        this.setTitle("SAMPLE FRAME");
        this.setBackground(Color .green);
 }
 public void paint(Graphics g)
 {
  Font f1=new Font("arial",Font.ITALIC+Font.BOLD,35);//35 is font size
  this.setForeground(Color.black);
  g.setFont(f1);
  g.drawString("DURGA SOFTWARE SOLUTIONS",100,100);
 }
}
class UdFrame
{
 public static void main(String args[])
 {
     MyFrame f =new MyFrame();
           
 }
}
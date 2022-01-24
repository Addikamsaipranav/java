public class Text1 extends Applet
{
     public void init()
    {
     setVisible(true);
     setSize(200,200);
     }
     public void paint(Graphics g)
     {
     g.setColor(new Color(0,0,255));
     g.drawRect(50, 100 , 100, 50);
     }
}
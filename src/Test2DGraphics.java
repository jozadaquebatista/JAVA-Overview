import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Peach extends JPanel
{

    public void paintComponent(Graphics g)
    {
    
        super.paintComponent(g);
        this.setBackground(new Color(200,200,200, 10));
        
        g.setColor(Color.BLUE);
        
        //for(int i = 0; i < 50; i+=.01)
        g.fillRect(25, 25, 100, 30);
        
        g.setColor(new Color(190,81,215));
        g.fillRect(25, 65, 100, 30);
        
        g.setColor(Color.RED);
        g.drawString("this is some text LOL", 25, 120);
    
    }

}

public class Test2DGraphics
{

    

    public static void main(String[] args)
    {
    
        JFrame frame = new JFrame("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(new Peach());
        frame.setSize(800, 600);
        frame.setVisible(true);
    
    }

}

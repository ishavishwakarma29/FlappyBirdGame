import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FlappyPanel extends JPanel implements ActionListener {

    final int WIDTH = 525, HEIGHT = 550;
    int flappyHeight = HEIGHT/4;
    int flappyV = 0, flappyA = 1;

    public FlappyPanel()
    {
        setSize(WIDTH, HEIGHT);
        setFocusable(true);

        setBackground(Color.BLACK);
        new Timer(40, this).start();
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        drawFlappy(g);
    }

    private void drawFlappy(Graphics g)
    {
        g.setColor(Color.WHITE);

        g.fillRect(75, flappyHeight+flappyV, 50, 50);
    }
    public void actionPerformed(ActionEvent e)
    {
        flappyV -= flappyA;
        repaint();
    }

    public void keyType(KeyEvent e)
    {

    }

    public void keyPressed(KeyEvent e)
    {
        int code = e.getKeyCode();

        if(code == e.VK_SPACE)
        {
            flappyV = -4;
        }
    }

    public void keyReleased(KeyEvent e)
    {

    }
}

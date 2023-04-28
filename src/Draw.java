import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Draw extends JPanel {

    public void paintComponent  (Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);
        g.fillRect(25,25,100,30);

        g.setColor(new Color(190,81,215));
        g.fillRect(25,65,100,30);

        g.setColor(Color.RED);
        g.drawString("This is some text", 25, 120);

        g.setColor(Color.GREEN);
        g.drawLine(150,25,300,45);

        g.setColor(Color.ORANGE);
        g.drawRect(150,55,100,30);

        g.setColor(Color.GRAY);
        g.fillOval(150,95,100,30);

        g.setColor(Color.PINK);
        g.fill3DRect(150,160,100,50,true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Draw d = new Draw();
        frame.add(d);
        frame.setSize(400,300);
        frame.setVisible(true);
    }

}

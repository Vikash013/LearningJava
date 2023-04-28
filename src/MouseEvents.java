import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends JFrame {

    public static void main(String[] args) {
        MouseEvents me = new MouseEvents();
        me.setSize(400,400);
        me.setDefaultCloseOperation(EXIT_ON_CLOSE);
        me.setVisible(true);
    }

    private JPanel mousepanel;
    private JLabel statusbar;

    public MouseEvents(){
        super("title");

        mousepanel = new JPanel();
        mousepanel.setBackground(Color.white);
        add(mousepanel, BorderLayout.CENTER);

        statusbar = new JLabel("default");
        add(statusbar, BorderLayout.SOUTH);

        MouseEventHandler handler = new MouseEventHandler ();
        mousepanel.addMouseListener(handler);
        mousepanel.addMouseMotionListener(handler);

    }

    private class MouseEventHandler implements MouseListener, MouseMotionListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            statusbar.setText(String.format("Clicked at %d, %d", e.getX(), e.getY()));
        }

        @Override
        public void mousePressed(MouseEvent e) {
            statusbar.setText("You pressed down the mouse");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            statusbar.setText("You released the mouse");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            statusbar.setText("You entered the area");
            mousepanel.setBackground(Color.cyan);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            statusbar.setText("The mouse has left the window");
            mousepanel.setBackground(Color.white);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            statusbar.setText("You are dragging the mouse");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            statusbar.setText("You moved the mouse");
        }
    }
}

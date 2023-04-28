import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DetectArrowKeys {
    int upCount = 0;
    int downCount = 0;
    int rightCount = 0;
    int leftCount = 0;

    public static void main(String[] args) {
        new DetectArrowKeys();
    }

    public DetectArrowKeys () {

        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setFocusable(true);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        JLabel up = new JLabel("Up: " + upCount);
        JLabel down = new JLabel("Down: " + downCount);
        JLabel right = new JLabel("Right: " + rightCount);
        JLabel left = new JLabel("Left: " + leftCount);

        panel.add(up);
        panel.add(down);
        panel.add(right);
        panel.add(left);

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch(keyCode){
                    case KeyEvent.VK_UP:
                        up.setText("Up: " + ++upCount);
                        break;
                    case KeyEvent.VK_DOWN:
                        down.setText("Down: " + ++downCount);
                        break;
                    case KeyEvent.VK_RIGHT:
                        right.setText("Right: " + ++rightCount);
                        break;
                    case KeyEvent.VK_LEFT:
                        left.setText("Left: " + ++leftCount);
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        frame.add(panel);

    }

}

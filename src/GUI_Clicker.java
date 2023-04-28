import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Clicker implements ActionListener {

    JFrame frame = new JFrame("My GUI");
    JButton button = new JButton("Click me");
    JLabel label = new JLabel();

    private int clicks = 0;

    public static void main(String[] args) {

        JFrame frame = new JFrame("My GUI");
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me");
        button.setBounds(100,100,200,50);
        button.setFocusable(false);
        button.addActionListener(new GUI_Clicker());
        frame.add(button);

        JLabel label = new JLabel("Number of clicks: 0");
        label.setBounds(135,150,200,50);
        frame.add(label);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clicks++;
        label.setText("Number of clicks: " + clicks);
        }

}


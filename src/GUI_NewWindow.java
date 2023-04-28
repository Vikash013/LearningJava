import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_NewWindow implements ActionListener {
JFrame frame1 = new JFrame();
JButton myButton = new JButton();

    GUI_NewWindow(){

        myButton.setText("New Window");
        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this); //this allows the button to have a function

        frame1.add(myButton);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(420,420);
        frame1.setLayout(null); //IMPORTANT - this allows components to be added into the position I want
        frame1.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) { //this will allow you to code what happens when the button is pressed
        if (e.getSource()==myButton){
            frame1.dispose(); //will close the first frame upon clicking button, without this we can infinitely click the button and create more windows

            JFrame frame2 = new JFrame();
            JLabel label2 = new JLabel("Hello!");

            label2.setBounds(0,0,100,50);
            label2.setFont(new Font(null, Font.PLAIN, 25));
            frame2.add(label2);

            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame2.setSize(420,420);
            frame2.setLayout(null);
            frame2.setVisible(true);
        }
    }

    public static void main(String[] args) {
        GUI_NewWindow GUINewWindow = new GUI_NewWindow();
    }

}

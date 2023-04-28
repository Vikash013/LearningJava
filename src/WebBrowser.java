import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class WebBrowser extends JFrame{

    private JTextField addressBar;
    private JEditorPane display;

    public WebBrowser (){
        super("Cool Browser");

        addressBar = new JTextField("Enter a URL (remove this text)");
        addressBar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadPage(e.getActionCommand());
            }
        });
        add(addressBar, BorderLayout.NORTH);


        display = new JEditorPane();
        display.setEditable(false);
        display.addHyperlinkListener(new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType()==HyperlinkEvent.EventType.ACTIVATED){
                    loadPage(e.getURL().toString());
                }
            }
        });
        add(display, BorderLayout.CENTER);
    }

    private void loadPage(String userText){
        try {
            display.setPage(userText);
            addressBar.setText(userText);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        WebBrowser webBrowser = new WebBrowser();
        webBrowser.setDefaultCloseOperation(EXIT_ON_CLOSE);
        webBrowser.setSize(700,500);
        webBrowser.setVisible(true);
    }

}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class BackgroundGUI {

    Scanner scan = new Scanner(System.in);
    Font bigFont = new Font("Cambria", Font.BOLD, 30);
    Font smallFont = new Font("Cambria", Font.BOLD, 25);

    public static void main(String[] args) {

        new BackgroundGUI();

    }

    public BackgroundGUI() {

        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("windows11.jpg"));
        JLabel backgroundLabel = new JLabel(imageIcon);
        backgroundLabel.setSize(1920,1080);

        JPanel panel = new JPanel();
        panel.setBounds(500,200,500,350);
        panel.setBackground(new Color(64, 88, 115, 77));
        backgroundLabel.add(panel);

        JLabel login = new JLabel("Login");
        login.setBounds(525, 225, 100,50);
        login.setForeground(Color.WHITE);
        login.setFont(bigFont);
        backgroundLabel.add(login);

        JLabel username = new JLabel("Username: ");
        username.setBounds(525, 300, 180,50);
        username.setForeground(Color.WHITE);
        username.setFont(smallFont);
        backgroundLabel.add(username);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(675,310,270,30);
        usernameField.setFont(smallFont);
        backgroundLabel.add(usernameField);

        JLabel password = new JLabel("Password: ");
        password.setBounds(525, 350, 180,50);
        password.setForeground(Color.WHITE);
        password.setFont(smallFont);
        backgroundLabel.add(password);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(675,370,270,30);
        passwordField.setFont(smallFont);
        backgroundLabel.add(passwordField);

        JButton clearBtn = new JButton("Clear");
        clearBtn.setBounds(525, 475, 100,50);
        clearBtn.setFont(smallFont);
        clearBtn.setFocusable(false);
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usernameField.setText("");
                passwordField.setText("");
            }
        });
        backgroundLabel.add(clearBtn);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(680, 475, 100,50);
        loginBtn.setFont(smallFont);
        loginBtn.setFocusable(false);
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String tokens [] = null;
                String userN,passW;
                try {
                    FileReader fr = new FileReader("login.txt");
                    BufferedReader br = new BufferedReader(fr);
                    String line = br.readLine();
                    while (line != null){
                        tokens = line.split("\n");
                        userN = tokens[0];
                        passW = tokens[1];
                        line = br.readLine();

                        if (usernameField.getText().equals(userN) && passwordField.getText().equals(passW)){
                            JOptionPane.showMessageDialog(null,"Login successful");
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"Incorrect");
                        }
                    }
                    br.close();
                    fr.close();

                }
                catch (IOException ioEx) {
                    System.out.println(ioEx);
                }
            }

        });
        backgroundLabel.add(loginBtn);

        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(800, 475, 150,50);
        registerBtn.setFont(smallFont);
        registerBtn.setFocusable(false);
        registerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = passwordField.getText();
                try {
                    FileWriter fw = new FileWriter("login.txt", true);
                    PrintWriter pw = new PrintWriter(fw);

                    if (usernameField.getText().equals("") || passwordField.getText().equals(""))
                        JOptionPane.showMessageDialog(null,"Invalid data");
                    else {
                        pw.write("\nUsername: " + username);
                        pw.write("\nPassword: " + password);
                        pw.write("\n-----");
                        pw.close();
                        JOptionPane.showMessageDialog(null, "Account created");
                    }
                    pw.close();
                }
                catch (IOException r) {
                    throw new RuntimeException(r);
                }
            }
        });
        backgroundLabel.add(registerBtn);

        JFrame frame = new JFrame("Login");
        frame.add(backgroundLabel);
        frame.setSize(1500,850);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}

/* this code reads all the login.txt file and outputs to console

try {
        FileReader fr = new FileReader("login.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;

        while ((line = br.readLine()) != null){
        System.out.println(line);
        }

        br.close();
        fr.close();
        } catch (FileNotFoundException ex) {
        throw new RuntimeException(ex);
        } catch (IOException ex) {
        throw new RuntimeException(ex);
        }


 */



/*
    File f = new File("logins.txt");
    BufferedReader br = null;
                try {
                        br = new BufferedReader(new FileReader(f));
                        } catch (FileNotFoundException ex) {
                        throw new RuntimeException(ex);
                        }

                        Object [] Lines = br.lines().toArray();

                        for (int i=0; i<Lines.length; i++) {
        String Line = Lines[i].toString().trim();
        String[] Row = Line.split("\n");
        if (usernameField.getText().equals(Row[i]) && passwordField.getText().equals(Row[i++])){
        System.out.println("Login successful");
        }
        else {
        System.out.println("Login unsuccessful");
        }
        }


 */
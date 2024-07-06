import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login(){
        getContentPane().setBackground(Color.WHITE);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        add(image);
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }
}
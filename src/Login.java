import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    Login(){
        //setting frame
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image. setBounds(0, 0, 600, 500);
        add(image);

        //adding heading
        JLabel heading = new JLabel("Quiz Time!!!");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        //adding name
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        add(name);

        //taking name input
        JTextField tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        add(tfname);

        //button
        JButton btn = new JButton("Start");
        btn.setBounds(755, 270, 120, 25);
        btn.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btn.setBackground(new Color(30, 144, 254));
        btn.setForeground(Color.WHITE);
        btn.addActionListener(this);
        add(btn);

        JButton back = new JButton("Back");
        back.setFont(new Font("Times New Roman", Font.BOLD, 14));
        back.setBounds(915, 270, 120, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Start")){

        }else if(e.getActionCommand().equals("Back")){
            setVisible(false);
        }
    }
}
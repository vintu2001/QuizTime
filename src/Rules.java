import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start,back;
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to MindX Quiz!");
        heading.setBounds(50, 20, 700, 50);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 760, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>" +
                        "1. You are given 10 questions to answer." + "<br>" +
                        "2. Each question has 4 options." + "<br>" +
                        "3. Select the correct option." + "<br>" +
                        "4. You get 20 seconds to answer each question." + "<br>" +
                        "5. You get 10 points for each correct answer." + "<br>" +
                        "6. There is no negative marking." + "<br>" +
                        "7. The quiz is over once you answer all the questions or time is up." + "<br>" +
                        "8. You can't go back to the previous question." + "<br>" +
                        "9. You can't select multiple options." + "<br>" +
                        "10. You can't modify the answer after submitting." + "<br>" +
                        "<html>"
        );
        add(rules);


        //adding back and start button

        back = new JButton("Back");
        back.setBounds(400, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        start = new JButton("Start");
        start.setBounds(250, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);




        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }else{
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }


}

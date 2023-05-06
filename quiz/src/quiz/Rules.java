package quiz;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start, back;
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. Read each question carefully and choose the best answer to each one. " + "<br><br>" +
                "2. The quiz will be of  5 minute duration. Each question have 30 seconds, after 30 seconds it gets automatically passed to the next question.  " + "<br><br>" +
                "3. No negative points for the wrong answer." + "<br><br>" +
                "4. 10 points is awarded for the correct answer." + "<br><br>" +
                "5. Not allowed to navigate from one question to another" + "<br><br>" +
                "6. Click the radio button to indicate your choice." + "<br><br>" +
                "7. Select an answer for every question. Unanswered questions will be scored as incorrect." + "<br><br>" +
                "8. If you want to try to get a better score, click the Try Again button at the results page. You can try the quiz as many times as you like." + "<br><br>" +
            "<html>"
        );
        add(rules);  
        
         back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new Rules("User");
    }
    
}

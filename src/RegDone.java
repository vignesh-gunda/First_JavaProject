
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.File;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;








public class RegDone
{
  JFrame jframe;


String name;
Credentials cred;

	public RegDone(String name, Credentials cred) {
    this.name = name;
    this.cred = cred;


            //adding panels,  frames and components
             jframe = new JFrame("REGISTERED");

             JLabel label1 = new JLabel("Welcome "+ name +"!!");
             jframe.add(label1);
             label1.setBounds(0, 15, 470, 100);
             label1.setHorizontalAlignment(JLabel.CENTER);
             label1.setFont(new Font("Times New Roman", Font.BOLD, 28));

             JLabel label2 = new JLabel("You have registered successfully!" );
             jframe.add(label2);
             label2.setBounds(0, 100, 470, 100);
             label2.setHorizontalAlignment(JLabel.CENTER);
             label2.setFont(new Font("Times New Roman", Font.PLAIN, 22));



            JButton nextb = new JButton("NEXT");
            nextb.setForeground(Color.WHITE);
            nextb.setFont(new Font("Times New Roman", Font.BOLD, 20));
            nextb.setBackground(new Color(0xF79489));
            nextb.setBorder(BorderFactory.createEmptyBorder());
            nextb.setOpaque(true);
            nextb.setFocusable(false);

            jframe.getContentPane().setBackground(new Color(0xF9F1F0));


          //  jframe.setBackground(new Color(0x0C2D48));

            // ImageIcon thanks = new ImageIcon("images/thanks.png");
            // JLabel background = new JLabel("", thanks, JLabel.CENTER);
            // background.setBounds(100, 30, 239, 114);
            // jframe.add(background);
            jframe.add(nextb);
            nextb.setBounds(200, 220, 100, 50);


            //icon on the head
            ImageIcon icon = new ImageIcon("images/icon.png");
            jframe.setIconImage(icon.getImage());
            //ImageIcon logo = new ImageIcon("images/logo.jpg");




             nextb.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae)
             {
               new LoginForm(cred);
               jframe.dispose();
             }
             }); //end of action listener for contact button

             jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             jframe.setSize(500, 350);
             jframe.setLocationRelativeTo(null);
             jframe.setLayout(null);
             jframe.setVisible(true);



	}

}

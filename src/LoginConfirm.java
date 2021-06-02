
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.File;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;








public class LoginConfirm
{
  JFrame jframe;


String name;
Credentials cred;


	public LoginConfirm(String name, Credentials cred) {

    this.name = name;
    System.out.println(name);

            //adding panels,  frames and components
             jframe = new JFrame("LOGIN SUCCESSFUL");


            JButton nextb = new JButton("NEXT");
            nextb.setForeground(Color.WHITE);
            nextb.setFont(new Font("Times New Roman", Font.BOLD, 20));
            nextb.setBackground(new Color(0xF79489));
            nextb.setBorder(BorderFactory.createEmptyBorder());
            nextb.setOpaque(true);
            nextb.setFocusable(false);

            JLabel label = new JLabel("Welcome "+ name +", your login was successful!" );
            jframe.add(label);
            label.setBounds(18, 15, 400, 100);
            label.setFont(new Font("Times New Roman", Font.BOLD, 20));


            jframe.getContentPane().setBackground(new Color(0xF9F1F0));

          //  jframe.setBackground(new Color(0x0C2D48));

            // ImageIcon thanks = new ImageIcon("images/thanks.png");
            // JLabel background = new JLabel("", thanks, JLabel.CENTER);
            // background.setBounds(50, 30, 239, 114);
            // jframe.add(background);
            jframe.add(nextb);
            nextb.setBounds(170, 120, 100, 50);


            //icon on the head
            ImageIcon icon = new ImageIcon("images/icon.png");
            jframe.setIconImage(icon.getImage());
            //ImageIcon logo = new ImageIcon("images/logo.jpg");




             nextb.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae)
             {
               new HomeLogin(cred);
               jframe.dispose();
             }
             }); //end of action listener for contact button

             jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             jframe.setSize(450, 250);
             jframe.setLocationRelativeTo(null);
             jframe.setLayout(null);
             jframe.setVisible(true);



	}

}

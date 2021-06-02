import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.File;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;


public class Confirm
{
  JFrame jframe;
  JLabel title;
  JPanel panel;


  Credentials cred;


	public Confirm(Credentials cred) {
    this.cred = cred;
    

             //adding panels,  frames and components
             jframe = new JFrame("CONFIRM LOGOUT");
             panel = new JPanel();
             title = new JLabel("Are you sure you want to log out?");


             jframe.add(panel);
             panel.setBounds(0, 0, 400, 20);
             panel.setBackground(new Color(0x274472));





             jframe.add(title);
             title.setBounds(20, 20, 400, 60);
             title.setFont(new Font("Times New Roman", Font.BOLD, 25));





            // yes button
            JButton yesb = new JButton("Yes");
            yesb.setForeground(Color.WHITE);
            yesb.setFont(new Font("Times New Roman", Font.BOLD, 20));
            yesb.setBackground(new Color(0x274472));
            yesb.setBorder(BorderFactory.createEmptyBorder());
            yesb.setOpaque(true);
            yesb.setFocusable(false);


            // NO button physical apearance
            JButton nob = new JButton("No");
            nob.setForeground(Color.WHITE);
            nob.setFont(new Font("Times New Roman", Font.BOLD, 18));
            nob.setBackground(new Color(0x274472));
            nob.setBorder(BorderFactory.createEmptyBorder());
            nob.setOpaque(true);
            nob.setFocusable(false);

            //jframe.getContentPane().setBackground(new Color(0x274472));

          //  jframe.setBackground(new Color(0x0C2D48));

            // ImageIcon thanks = new ImageIcon("images/confirmpic.png");
            // JLabel background = new JLabel("", thanks, JLabel.CENTER);
            // background.setBounds(0, 0, 559, 462);
            // jframe.add(background);
            jframe.add(yesb);
            yesb.setBounds(80, 90, 70, 40);


            jframe.add(nob);
            nob.setBounds(220, 90, 70, 40);


            //icon on the head
            ImageIcon icon = new ImageIcon("images/icon.png");
            jframe.setIconImage(icon.getImage());
            //ImageIcon logo = new ImageIcon("images/logo.jpg");




             yesb.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae)
             {
               new Home(cred);
               jframe.dispose();
             }
             }); //end of action listener for contact button


// no buttons

             nob.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae)
             {
               new HomeLogin(cred);
               jframe.dispose();
             }
             }); //end of action listener for contact button

             jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             jframe.setSize(400, 200);
             jframe.setLocationRelativeTo(null);
             jframe.setLayout(null);
             jframe.setVisible(true);


	}

}

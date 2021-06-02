
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.File;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;







public class Home
{
  JFrame jf;
  JPanel head;
  JPanel mainmenu;
  JPanel content;
  JPanel info;



  Credentials cred;


	public Home(Credentials cred) {
    this.cred = cred;


            //adding panels,  frames and components
             jf = new JFrame("HOME");
             head = new JPanel();
             mainmenu = new JPanel();
             content = new JPanel();
             info = new JPanel();

            JButton loginb = new JButton("LOGIN");
            JButton registerb = new JButton("REGISTER");


            JLabel heading = new JLabel("\n \nMAHINDRA UNIVERSITY ALUMNI");
            JTextArea tf = new JTextArea();
            JTextArea infotxt = new JTextArea();
            JLabel infohead = new JLabel("What do we do?");




            //button features
            // button text color
            loginb.setForeground(new Color(0x071330));
            registerb.setForeground(new Color(0x071330));

            // button text
            loginb.setFont(new Font("Times New Roman", Font.BOLD, 20));
            registerb.setFont(new Font("Times New Roman", Font.BOLD, 20));

            // button background Color
            loginb.setBackground(Color.WHITE);
            registerb.setBackground(Color.WHITE);


            loginb.setBorder(BorderFactory.createEmptyBorder());
            registerb.setBorder(BorderFactory.createEmptyBorder());


             loginb.setOpaque(true);
             loginb.setFocusable(false);
             registerb.setOpaque(true);
             registerb.setFocusable(false);


            //icon on the head
            ImageIcon icon = new ImageIcon("images/icon.png");
            jf.setIconImage(icon.getImage());
            //ImageIcon logo = new ImageIcon("images/logo.jpg");








            // head changes and headbutton changes

            jf.add(head);
            head.setBounds(0,0,1200,90);
            head.setBackground(new Color(0, 0, 0, 80));
            ImageIcon logo = new ImageIcon("images/logo.png");
            JLabel logoimage = new JLabel("", logo, JLabel.CENTER);
            logoimage.setBounds(10,0, 564, 80);
            head.add(logoimage);
            loginb.setBounds(950, 15, 100, 50);
            head.add(loginb);
            registerb.setBounds(1060, 15, 120, 50);
            head.add(registerb);
            head.setLayout(null);




            // contents changes
            heading.setBounds(30, 20, 500, 40);
            heading.setForeground(new Color(0xFFFFFF));
            heading.setFont(new Font("Times New Roman", Font.BOLD, 22));


            tf.setText("We the alumni of this prestegious institution,Mahindra University, are proud to welcome you all to our platform and forum of communication, to help make the Mahindra community as helpful, tightknit and compact as possible, and ensure the Mecster family is always together! This platform is the perfect place for us to reminisce, celebrate and help the University that made our careers and lives what they are today.");
            tf.setLineWrap(true);
            tf.setBounds(25, 80, 400, 300);
            tf.setForeground(new Color(0xFFFFFF));
            tf.setWrapStyleWord(true);
            tf.setBackground(new Color(0, 0, 0, 0));
            tf.setEditable(false);
            tf.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            content.setBackground(new Color(0, 0, 0, 130));
            content.setBounds(680,330, 450 ,400);
            content.setLayout(null);
            content.add(heading);
            content.add(tf);
            jf.add(content);



//info box changes
            jf.add(info);
            info.setBackground(new Color(0, 0, 0, 130));
            info.setBounds(80,550, 490 ,180);
            info.setLayout(null);

            //infotxt

            infotxt.setText("The Mahindra Alumni Association (MAA) maintains and enhances a highly engaged, vibrant community of alumni and friends worldwide, brought together by Ecole Centrale School of Engineering. It helps connect alumni to the University and each other through a wealth of community activities, continuing education programs, online services, and events around the world.");
            infotxt.setLineWrap(true);
            infotxt.setBounds(5, 35, 485, 170);
            infotxt.setForeground(new Color(0xFFFFFF));
            infotxt.setWrapStyleWord(true);
            infotxt.setBackground(new Color(0, 0, 0, 0));
            infotxt.setEditable(false);
            infotxt.setFont(new Font("Times New Roman", Font.PLAIN, 18));
            info.add(infotxt);

            //infohead
            infohead.setBounds(5, 5, 400, 25);
            infohead.setForeground(new Color(0xFFFFFF));
            infohead.setFont(new Font("Times New Roman", Font.BOLD, 20));
            info.add(infohead);





            // background image

            ImageIcon bg = new ImageIcon("images/homebg.png");
            JLabel background = new JLabel("", bg, JLabel.CENTER);
            background.setBounds(0, 0, bg.getIconWidth(), bg.getIconHeight());
            jf.add(background);



            //adding action listeners

             loginb.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae)
             {
               new LoginForm(cred);
               ((JFrame) SwingUtilities.getWindowAncestor(head)).dispose();
             }
            });




            registerb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
              new RegisterForm();
                           ((JFrame) SwingUtilities.getWindowAncestor(head)).dispose();

            }
           });




             //standard procedure and settings for frame

             jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             jf.setSize(1200, 800);
             jf.setLocationRelativeTo(null);
             jf.setVisible(true);
             jf.setLayout(null);



	}


}

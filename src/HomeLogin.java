
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.File;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;









public class HomeLogin
{
  JFrame jf;
  JPanel head;
  JPanel mainmenu;
  JPanel content;
  JPanel info;


Credentials cred;

	public HomeLogin(Credentials cred) {
    this.cred = cred;

            //adding panels,  frames and components
             jf = new JFrame("ALUMNI PORTAL");
             head = new JPanel();
             mainmenu = new JPanel();
             content = new JPanel();
             info = new JPanel();

            JButton logoutb = new JButton("LOGOUT");
            JButton homeb = new JButton("HOME");
            JButton aboutb = new JButton("ABOUT US");
            JButton eventb = new JButton("EVENTS");
            JButton contactb = new JButton("CONTACT US");
            JButton forumb = new JButton("FORUM");


            JLabel heading = new JLabel("\n \nMAHINDRA UNIVERSITY ALUMNI");
            JTextArea tf = new JTextArea();
            JTextArea infotxt = new JTextArea();
            JLabel infohead = new JLabel("What do we do?");




            //button features
            // button text color
            logoutb.setForeground(new Color(0x071330));
            forumb.setForeground(new Color(0x071330));
            aboutb.setForeground(new Color(0x071330));
            eventb.setForeground(new Color(0x071330));
            contactb.setForeground(new Color(0x071330));
            homeb.setForeground(new Color(0x071330));

            // button text
            logoutb.setFont(new Font("Times New Roman", Font.BOLD, 20));
            forumb.setFont(new Font("Times New Roman", Font.BOLD, 20));
            aboutb.setFont(new Font("Times New Roman", Font.BOLD, 20));
            eventb.setFont(new Font("Times New Roman", Font.BOLD, 20));
            contactb.setFont(new Font("Times New Roman", Font.BOLD, 20));
            homeb.setFont(new Font("Times New Roman", Font.BOLD, 20));

            // button background Color
            logoutb.setBackground(Color.WHITE);
            forumb.setBackground(Color.WHITE);
            aboutb.setBackground(Color.WHITE);
            eventb.setBackground(Color.WHITE);
            contactb.setBackground(Color.WHITE);
            homeb.setBackground(Color.WHITE);


            logoutb.setBorder(BorderFactory.createEmptyBorder());
            forumb.setBorder(BorderFactory.createEmptyBorder());
            aboutb.setBorder(BorderFactory.createEmptyBorder());
            eventb.setBorder(BorderFactory.createEmptyBorder());
            contactb.setBorder(BorderFactory.createEmptyBorder());
            homeb.setBorder(BorderFactory.createEmptyBorder());

             logoutb.setOpaque(true);
             logoutb.setFocusable(false);
             forumb.setOpaque(true);
             forumb.setFocusable(false);
             aboutb.setOpaque(true);
             aboutb.setFocusable(false);
             eventb.setOpaque(true);
             eventb.setFocusable(false);
             contactb.setOpaque(true);
             contactb.setFocusable(false);
             homeb.setOpaque(true);
             homeb.setFocusable(false);



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
            logoutb.setBounds(950, 15, 100, 50);
            head.add(logoutb);
            forumb.setBounds(1060, 15, 100, 50);
            head.add(forumb);
            head.setLayout(null);



            //mainmenu changes

            jf.add(mainmenu);
            mainmenu.setBounds(0,100,150,310);
            mainmenu.setBackground(new Color(0, 0, 0, 80));
            homeb.setBounds(7,40, 135 ,50);
            mainmenu.add(homeb);
            aboutb.setBounds(7,100, 135 ,50);
            mainmenu.add(aboutb);
            eventb.setBounds(7,160, 135 ,50);
            mainmenu.add(eventb);
            contactb.setBounds(7,220, 135 ,50);
            mainmenu.add(contactb);
            mainmenu.setLayout(null);

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


            homeb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
              homeb.setEnabled(false);



            }
           });


             logoutb.addActionListener(new ActionListener(){   //logging out
             public void actionPerformed(ActionEvent ae)
             {
               new Confirm(cred);
               ((JFrame) SwingUtilities.getWindowAncestor(head)).dispose();
             }
            });




            forumb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
              new ChatBox(cred);
              ((JFrame) SwingUtilities.getWindowAncestor(head)).dispose();

            }
           });



           aboutb.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae)
           {
             new AboutUs(cred);
             ((JFrame) SwingUtilities.getWindowAncestor(mainmenu)).dispose();

           }
          });



          eventb.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ae)
          {
            new Events(cred);
            ((JFrame) SwingUtilities.getWindowAncestor(mainmenu)).dispose();

          }
         });





            contactb.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae)
             {
               new Contact(cred);
             ((JFrame) SwingUtilities.getWindowAncestor(mainmenu)).dispose();
             }
             }); //end of action listener for contact button


             //standard procedure and settings for frame

             jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             //jf.setLocation(200,20);
             jf.setSize(1200, 800);
             jf.setLocationRelativeTo(null);
             jf.setVisible(true);
             jf.setLayout(null);



	}


}

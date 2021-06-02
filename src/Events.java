
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.File;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;








public class Events
{
  JFrame jf;
  JPanel head;
  JPanel mainmenu;
  JPanel content;
  JPanel backdrop;




  Credentials cred;

	public Events(Credentials cred) {
    this.cred = cred;


            //adding panels,  frames and components
             jf = new JFrame("EVENTS");
             head = new JPanel();
             mainmenu = new JPanel();
             content = new JPanel();
             backdrop= new JPanel();

             JButton logoutb = new JButton("LOGOUT");
             JButton homeb = new JButton("HOME");
             JButton aboutb = new JButton("ABOUT US");
             JButton eventb = new JButton("EVENTS");
             JButton contactb = new JButton("CONTACT US");
             JButton forumb = new JButton("FORUM");

            JLabel heading = new JLabel("UPCOMING EVENTS");
            JTextArea tf1 = new JTextArea();
            JTextArea tf2 = new JTextArea();
            JTextArea tf3 = new JTextArea();



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

            heading.setBounds(135, 10, 500, 20);
            heading.setForeground(new Color(0xFFFFFF));
            heading.setFont(new Font("Times New Roman", Font.BOLD, 22));


            tf1.setText("The Organization of Alumni of Centrale Institutions, is hosting its annual event (CACS India) at MEC on Monday 27th June, 2021. You can register for this event (free)");
            tf1.setLineWrap(true);
            tf1.setBounds(25, 55, 500, 80);
            tf1.setForeground(new Color(0x000000));
            tf1.setWrapStyleWord(true);
            tf1.setBackground(new Color(255, 255, 255));
            tf1.setEditable(false);
            tf1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

            tf2.setText("The Entrepreneurship and Innovation Cell of Mahindra University welcomes you to its first E-SUMMIT.  Scheduled for the 24th and 25th of June, 2021 the event will play host to a variety of unique events such as the Startup Sprint in addition to various standard events such as Startup Showcase and Business Idea Competition. Students and participants get an opportunity to attend keynote speeches, panel discussions and interact with successful entrepreneurs, mentors and investors. ");
            tf2.setLineWrap(true);
            tf2.setBounds(25, 145, 500, 200);
            tf2.setForeground(new Color(0x000000));
            tf2.setWrapStyleWord(true);
            tf2.setBackground(new Color(255, 255, 255));
            tf2.setEditable(false);
            tf2.setFont(new Font("Times New Roman", Font.PLAIN, 20));

            tf3.setText("The National Conference on Futuristic Approaches in Civil Engineering (FACE-2021) aims to bring together researchers, engineers, scientists and industry professionals to an open forum to foster active discussions on the latest advances in the field of civil engineering. The conference explores current research problems such as construction, geotechnical, structural, environmental, water resources and transportation engineering. We cordially invite you to submit your scientific contributions to the FACE-2021 conference.");
            tf3.setLineWrap(true);
            tf3.setBounds(25, 355, 500, 220);
            tf3.setForeground(new Color(0x000000));
            tf3.setWrapStyleWord(true);
            tf3.setBackground(new Color(255, 255, 255));
            tf3.setEditable(false);
            tf3.setFont(new Font("Times New Roman", Font.PLAIN, 20));


            jf.add(content);
            //jf.setLocationRelativeTo(null);
            content.setBackground(new Color(0, 0, 0, 130));
            content.setBounds(600,100, 550 ,610);
            content.setLayout(null);
            content.add(heading);
            content.add(tf1);
            content.add(tf2);
            content.add(tf3);



            //image of speaker

            // ImageIcon events = new ImageIcon("images/eventsextra.png");
            // JLabel eventsimage = new JLabel("", events, JLabel.CENTER);
            // eventsimage.setBounds(150,100, events.getIconWidth(), events.getIconHeight());
            // jf.add(eventsimage);

//background

            ImageIcon bg = new ImageIcon("images/events.png");
            Image img = bg.getImage();
            Image temp_img = img.getScaledInstance(1200,800, Image.SCALE_SMOOTH);
            bg = new ImageIcon(temp_img);
            JLabel background = new JLabel("", bg, JLabel.CENTER);
            jf.add(background);



            //adding action listeners


            homeb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
              new HomeLogin(cred);
              ((JFrame) SwingUtilities.getWindowAncestor(mainmenu)).dispose();

            }
           });


             logoutb.addActionListener(new ActionListener(){
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
           eventb.setEnabled(false);
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

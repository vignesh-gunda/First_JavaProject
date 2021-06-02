

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;




public class Contact {

    JFrame jf;
    JPanel head;
    JPanel body;
    JPanel bgpanel;
    JPanel content;
    JPanel borderleft;
    JPanel borderdown;
    private JLabel title;

    private JLabel intro1;
    private JLabel name;
    private JLabel student;
    private JLabel email;
    private JLabel type;

    private JLabel intro2;
    private JTextField nametext;
    private JTextField emailtext;
    private JRadioButton yes;
    private JRadioButton no;
    private JTextField typetext;

    Credentials cred;


    // private ButtonGroup gengp;
    // private JComboBox date;
    // private JComboBox month;
    // private JComboBox year;
    // private JLabel add;
    // private JTextArea tadd;
    // private JCheckBox term;
    // private JButton sub;
    // private JButton reset;
    // private JTextArea tout;
    // private JLabel res;
    // private JTextArea resadd;
  public Contact(Credentials cred)
  {
    this.cred = cred;

    jf = new JFrame("CONTACT FORM");
    head = new JPanel();
    body = new JPanel();
    bgpanel = new JPanel();
    content = new JPanel();
    borderdown = new JPanel();
    borderleft = new JPanel();


    title = new JLabel("CONTACT US");

    JButton back = new JButton("BACK");

    intro1 = new JLabel("What's on your mind?", JLabel.CENTER);
    name = new JLabel("  FULL NAME:", JLabel.LEFT);
    email = new JLabel("  Year of Graduation?", JLabel.LEFT);
    student = new JLabel(" Are you a member?", JLabel.LEFT);
    type = new JLabel("  Type your message here:", JLabel.LEFT);
    JButton submit = new JButton("SUBMIT");
    JButton reset = new JButton("RESET");

    intro2 = new JLabel("Fill the following fields:");
    nametext = new JTextField();
    emailtext = new JTextField();
    typetext = new JTextField();
    yes = new JRadioButton("YES");
    no = new JRadioButton("NO");



//icon
    ImageIcon icon = new ImageIcon("images/icon.png");
    jf.setIconImage(icon.getImage());



// head and title settings
		jf.add(head, BorderLayout.NORTH);
    head.setPreferredSize(new Dimension(40, 40));
    head.setBackground(new Color(0x52688F));
    title.setFont(new Font("Times New Roman", Font.BOLD, 25));
    title.setForeground(new Color(0xFFFFFF));
    //title.setVerticalTextPosition(JLabel.BOTTOM);
    //back.setHorizontalAlignment(JButton.LEFT);
    //head.add(back);
    head.add(title);
    head.setLayout(new FlowLayout());

  // --------------------------body functions ----------------------------------
  jf.add(body, BorderLayout.CENTER);
  body.setLayout(new GridLayout(6, 2, 20, 40));
  body.setBackground(new Color(0xEEEDE7));

  body.add(intro1);
  body.add(intro2);

  body.add(name);
  body.add(nametext);

  body.add(email);
  body.add(emailtext);

  body.add(student);
  body.add(bgpanel);

  body.add(type);
  body.add(typetext);

  body.add(submit);
  body.add(reset);



  // body label beautification

//intro 1 and 2:
intro1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
intro1.setForeground(new Color(0xEEEDE7));
intro2.setFont(new Font("Times New Roman", Font.BOLD, 18));
intro2.setForeground(new Color(0x192E41));
intro1.setVerticalAlignment(JLabel.BOTTOM);
intro1.setVerticalTextPosition(JLabel.BOTTOM);
intro2.setVerticalAlignment(JLabel.BOTTOM);
intro2.setVerticalTextPosition(JLabel.BOTTOM);



  // name
  //name.setVerticalAlignment(JLabel.BOTTOM);
  name.setFont(new Font("Times New Roman", Font.BOLD, 16));
  name.setForeground(new Color(0x192E41));
  //name.setVerticalTextPosition(JLabel.BOTTOM);

  // email
  //email.setVerticalAlignment(JLabel.BOTTOM);
  email.setFont(new Font("Times New Roman", Font.BOLD, 16));
  email.setForeground(new Color(0x192E41));
  //email.setVerticalTextPosition(JLabel.BOTTOM);

  // Student or not
  //student.setVerticalAlignment(JLabel.BOTTOM);
  student.setFont(new Font("Times New Roman", Font.BOLD, 18));
  student.setForeground(new Color(0x192E41));
  //student.setVerticalTextPosition(JLabel.BOTTOM);

// textfields

nametext.setFont(new Font("Times New Roman", Font.PLAIN, 18));
emailtext.setFont(new Font("Times New Roman", Font.PLAIN, 18));
typetext.setFont(new Font("Times New Roman", Font.PLAIN, 18));

  // text box

  //type.setVerticalAlignment(JLabel.BOTTOM);
  type.setFont(new Font("Times New Roman", Font.BOLD, 18));
  type.setForeground(new Color(0x192E41));
  //type.setVerticalTextPosition(JLabel.BOTTOM);




  //radio buttons

  ButtonGroup bg = new ButtonGroup();
  yes.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  no.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  yes.setFocusable(false);
  no.setFocusable(false);
  yes.setBorder(BorderFactory.createEmptyBorder());
  no.setBorder(BorderFactory.createEmptyBorder());
  yes.setBounds(20, 15, 70, 30);
  no.setBounds(100, 15, 50, 30);


  bg.add(yes);
  bg.add(no);

  bgpanel.add(yes);
  bgpanel.add(no);
  bgpanel.setLayout(null);
  bgpanel.setBackground(new Color(0xEEEDE7));


  // submit Button and reset button

  submit.setForeground(new Color(0xFFFFFF));
  submit.setFont(new Font("Times New Roman", Font.BOLD, 18));
  submit.setBackground(new Color(0x52688F));
  submit.setOpaque(true);
  submit.setFocusable(false);
  submit.setBorder(BorderFactory.createEmptyBorder());

  reset.setForeground(new Color(0xFFFFFF));
  reset.setFont(new Font("Times New Roman", Font.BOLD, 18));
  reset.setBackground(new Color(0x52688F));
  reset.setOpaque(true);
  reset.setFocusable(false);
  reset.setBorder(BorderFactory.createEmptyBorder());





  //body.setBackground(new Color(0x000000));
//--------------------------end of all body functions---------------------------

// content functions
jf.add(content, BorderLayout.EAST);
content.setPreferredSize(new Dimension(50, 50));
content.setBackground(new Color(0xEEEDE7));

//content.setLayout(new GridLayout(5, 1, 50, 50));
//content.add(nametext);
//content.add(emailtext);
//content.add(typetext);



//nametext.setVerticalAlignment(JTextArea.BOTTOM);
        //nametext.setMargin(new Insets(50, 15, 15, 15));

        //nametext.setFont(new Font("Arial", Font.PLAIN, 15));
        //nametext.setSize(300, 400);
        //nametext.setLocation(500, 100);
        //nametext.setLineWrap(true);
        //nametext.setEditable(true);


// ------------borderdown functions----------------------------
jf.add(borderdown, BorderLayout.SOUTH);
borderdown.setLayout(null);
borderdown.setPreferredSize(new Dimension(40, 40));
borderdown.setBackground(new Color(0xEEEDE7));

// ------------borderleft functions----------------------------



jf.add(borderleft, BorderLayout.WEST);
borderleft.setPreferredSize(new Dimension(530, 75));
borderleft.setBackground(new Color(0xEEEDE7));
borderleft.setLayout(null);
borderleft.add(back);
back.setBounds(10, 40, 90, 35);
back.setForeground(new Color(0xFFFFFF));
back.setFont(new Font("Times New Roman", Font.BOLD, 18));
back.setBackground(new Color(0x52688F));
back.setOpaque(true);
back.setFocusable(false);
back.setBorder(BorderFactory.createEmptyBorder());

ImageIcon contactimg = new ImageIcon("images/analyze.png");
JLabel background = new JLabel("", contactimg, JLabel.CENTER);
borderleft.add(background);
background.setBounds(0, 0, contactimg.getIconWidth(), contactimg.getIconHeight());

// ImageIcon phone1 = new ImageIcon("images/phonedown.jpg");
// JLabel background1 = new JLabel("", phone1, JLabel.CENTER);
// borderdown.add(background1);
// background1.setBounds(0, 0, 400, 100);
//



// setting up action listeners


            back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
              new HomeLogin(cred);
              ((JFrame) SwingUtilities.getWindowAncestor(borderleft)).dispose();

            }
           });

           submit.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae)
           {

             if( (nametext.getText().isEmpty())==true || (emailtext.getText().isEmpty())==true  || (typetext.getText().isEmpty())==true  || (yes.isSelected()==false && no.isSelected()==false))
             {
               JOptionPane.showMessageDialog(null,"Please fill all fields. Thank you.","ALERT!!",JOptionPane.WARNING_MESSAGE);
             }
             else{
               String useryear = emailtext.getText();
               if(useryear.matches("^(20)\\d{2}$"))
               {
                 nametext.setText("");
                 emailtext.setText("");
                 bg.clearSelection();
                 typetext.setText("");
                 JOptionPane.showMessageDialog(null,"Thank You! Your message has been recorded","Message Successful",JOptionPane.INFORMATION_MESSAGE);

               }
                else
                {
                  JOptionPane.showMessageDialog(null,"Please enter a valid year. Thank you.","ALERT!!",JOptionPane.WARNING_MESSAGE);

                }

             }

             //new Recorded();
           }
          });

          reset.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ae)
          {
            nametext.setText("");
            emailtext.setText("");
            bg.clearSelection();
            typetext.setText("");

          }
          });



      // important end settings
		//jf.setLayout(new FlowLayout());

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(1050, 700);
    jf.setLocationRelativeTo(null);
		jf.setVisible(true);
  }


} // end of class

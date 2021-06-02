import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import java.util.regex.Pattern;


public class RegisterForm
{
    Credentials cred;
    JFrame frame;
    JLabel head = new JLabel();
    JLabel register_name = new JLabel("REGISTER");
    JLabel fullname_label = new JLabel("Full Name :");
    JLabel firstname_label = new JLabel("First Name");
    JLabel lastname_label = new JLabel("Last Name");
    JTextField firstname_tf = new JTextField();
    JTextField lastname_tf = new JTextField();
    JLabel gender = new JLabel("Gender :");
    JRadioButton radio1 = new JRadioButton("Male");
    JRadioButton radio2 = new JRadioButton("Female");
    ButtonGroup bg = new ButtonGroup();
    JLabel email_label = new JLabel("Email Address :");
    JTextField email = new JTextField();
    JLabel dob = new JLabel("Date Of Birth :");
    JLabel mobile = new JLabel("Mobile No. :");
    JTextField mobiletext = new JTextField();
    JLabel currentcity_label = new JLabel("Current City :");
    JTextField currentcity = new JTextField();
    JLabel userLabel = new JLabel("Username :");
    JLabel passLabel = new JLabel("Password :");
    JTextField userText = new JTextField();
    JPasswordField passText = new JPasswordField();
    ImageIcon background_img = new ImageIcon("images/two.png");
    ImageIcon mainicon = new ImageIcon("images/icon.png");
    JButton submit = new JButton("Submit");
    JButton back = new JButton("Back");

    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
        {
            return false;
        }
        else{
          return pat.matcher(email).matches();
        }
    }
    //Credentials cred;
    RegisterForm()
    {

       //this.cred = cred;

        frame = new JFrame();
        frame.setTitle("Registration Form");
        frame.setSize(1400,800);
        frame.setLocation(200,100);
        frame.setLocation(10,10);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        register_name.setBounds(570,5,300,50);
        register_name.setFont(new Font("Times New Roman",Font.BOLD,45));
        register_name.setForeground(new Color(0xF5F5F5));
        frame.add(register_name);

        head.setBounds(0,0,1400,60);
        head.setBackground(new Color(0x52688F));
        head.setOpaque(true);
        frame.add(head);


        fullname_label.setBounds(110,90,130,40);
        fullname_label.setFont(new Font("Times New roman",Font.BOLD,25));
        //fullname_label.setBackground(new Color(0xEEEDE7));
        //fullname_label.setOpaque(true);
        frame.add(fullname_label);

        firstname_tf.setBounds(320,90,150,40);
        firstname_tf.setFont(new Font("Josephine Sans Light",Font.BOLD,22));
        firstname_tf.setBackground(Color.white);
        firstname_tf.setOpaque(true);
        frame.add(firstname_tf);

        firstname_label.setBounds(320,130,100,25);
        firstname_label.setFont(new Font("Times New roman",Font.BOLD,15));
        // firstname_tf_label.setBackground(new Color(155,155,155));
        // firstname_tf_label.setOpaque(true);
        frame.add(firstname_label);

        lastname_tf.setBounds(475,90,150,40);
        lastname_tf.setFont(new Font("Josephine Sans Light",Font.BOLD,22));
        lastname_tf.setBackground(Color.white);
        lastname_tf.setOpaque(true);
        frame.add(lastname_tf);

        lastname_label.setBounds(475,130,100,25);
        lastname_label.setFont(new Font("Times New roman",Font.BOLD,15));
        // lastname_label.setBackground(new Color(155,155,155));
        // lastname_label.setOpaque(true);
        frame.add(lastname_label);

        gender.setBounds(110,170,130,40);
        gender.setFont(new Font("Times New roman",Font.BOLD,25));
        // gender.setBackground(new Color(155,155,155));
        // gender.setOpaque(true);
        frame.add(gender);

        radio1.setBounds(320,170,100,40);
        radio1.setFont(new Font("Times New roman",Font.BOLD,25));
        radio1.setBackground(new Color(0xEEEDE7));
        radio1.setFocusable(false);
        bg.add(radio1);
        frame.add(radio1);

        radio2.setBounds(430,170,120,40);
        radio2.setFont(new Font("Times New roman",Font.BOLD,25));
        radio2.setBackground(new Color(0xEEEDE7));
        radio2.setFocusable(false);
        bg.add(radio2);
        frame.add(radio2);

        email_label.setBounds(110,230,180,40);
        email_label.setFont(new Font("Times New roman",Font.BOLD,25));
        // email_label.setBackground(new Color(155,155,155));
        // email_label.setOpaque(true);
        frame.add(email_label);

        email.setBounds(320,230,300,40);
        email.setFont(new Font("Josephine Sans Light",Font.BOLD,22));
        email.setBackground(Color.white);
        email.setOpaque(true);
        frame.add(email);

        dob.setBounds(110,290,160,40);
        dob.setFont(new Font("Times New roman",Font.BOLD,25));
        // dob.setBackground(new Color(155,155,155));
        // dob.setOpaque(true);
        frame.add(dob);

        String days[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18",
        "19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String years[] = {"2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009",
        "2008","2007","2006","2005","2004","2003","2002","2001","2000"};
        String months[] = {"January","February","March","April","May","June","July","August","September",
        "October","November","December"};

        JComboBox<String> day = new JComboBox<>(days);
        JComboBox<String> month = new JComboBox<>(months);
        JComboBox<String> year = new JComboBox<>(years);

        day.setBounds(320,290,60,40);
        day.setFont(new Font("Josephine Sans Light",Font.BOLD,22));
        day.setBackground(Color.white);
        day.setOpaque(true);
        frame.add(day);

        month.setBounds(390,290,140,40);
        month.setFont(new Font("Josephine Sans Light",Font.BOLD,22));
        month.setBackground(Color.white);
        month.setOpaque(true);
        frame.add(month);

        year.setBounds(540,290,80,40);
        year.setFont(new Font("Josephine Sans Light",Font.BOLD,22));
        year.setBackground(Color.white);
        year.setOpaque(true);
        frame.add(year);

        mobile.setBounds(110,350,140,40);
        mobile.setFont(new Font("Times New Roman",Font.BOLD,25));
        // mobile.setBackground(new Color(155,155,155));
        // mobile.setOpaque(true);
        frame.add(mobile);

        mobiletext.setBounds(320,350,180,40);
        mobiletext.setFont(new Font("Josephine Sans Light",Font.BOLD,22));
        mobiletext.setBackground(Color.white);
        mobiletext.setOpaque(true);
        frame.add(mobiletext);

        currentcity_label.setBounds(110,410,150,40);
        currentcity_label.setFont(new Font("Times New Roman",Font.BOLD,25));
        // currentcity_label.setBackground(new Color(155,155,155));
        // currentcity_label.setOpaque(true);
        frame.add(currentcity_label);

        currentcity.setBounds(320,410,180,40);
        currentcity.setFont(new Font("Josephine Sans Light",Font.BOLD,22));
        currentcity.setBackground(Color.white);
        currentcity.setOpaque(true);
        frame.add(currentcity);

        userLabel.setBounds(110,470,130,40);
        userLabel.setFont(new Font("Times New roman",Font.BOLD,25));
        // userLabel.setBackground(new Color(155,155,155));
        // userLabel.setOpaque(true);
        frame.add(userLabel);

        userText.setBounds(320,470,180,40);
        userText.setFont(new Font("Josephine Sans Light",Font.BOLD,22));
        userText.setBackground(Color.white);
        userText.setOpaque(true);
        frame.add(userText);

        passLabel.setBounds(110,530,130,40);
        passLabel.setFont(new Font("Times New roman",Font.BOLD,25));
        // passLabel.setBackground(new Color(155,155,155));
        // passLabel.setOpaque(true);
        frame.add(passLabel);

        passText.setBounds(320,530,180,40);
        passText.setFont(new Font("Josephine Sans Light",Font.BOLD,22));
        passText.setBackground(Color.white);
        passText.setOpaque(true);
        frame.add(passText);

        JCheckBox terms = new JCheckBox("   I Agree to all the Terms and Contitions");
        terms.setBounds(130,590,500,40);
        terms.setFont(new Font("Times New Roman",Font.BOLD,25));
        terms.setBackground(new Color(0xEEEDE7));
        terms.setFocusable(false);
        // terms.addActionListener(this);
        frame.add(terms);

        submit.setBounds(360,650,150,60);
        submit.setFont(new Font("Times New Roman",Font.BOLD,28));
        submit.setBackground(new Color(0x52688F));
        submit.setForeground(Color.white);
        submit.setFocusable(false);


        back.setBounds(160,650,150,60);
        back.setFont(new Font("Times New Roman",Font.BOLD,28));
        back.setBackground(new Color(0x52688F));
        back.setForeground(Color.white);
        back.setFocusable(false);
        frame.add(back);





// if(uservalue=="" || passvalue == "" || emailvalue=="")
// {
//   cred = new Credentials("Team15", "Team151234", "Team15@gmail.com");
//
// }





        submit.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ae)
        {
            String fn = firstname_tf.getText();
            String ln = lastname_tf.getText();
            String em = email.getText();
            String mt = mobiletext.getText();
            String cc = currentcity.getText();
            String ut = userText.getText();
            String pt = String.valueOf(passText.getPassword());

            if(fn.equals("") || ln.equals("") || em.equals("") || mt.equals("") || cc.equals("") || ut.equals("") || pt.equals(""))
            {
                    JOptionPane.showMessageDialog(null,"Please fill all the fields","Attention !!!",
                    JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                if(terms.isSelected())
                {
                  if(mt.matches("\\d{10}"))
                  {
                    if(isValid(em))
                    {
                      String uservalue = userText.getText();
                      String passvalue = String.valueOf(passText.getPassword());
                      String emailvalue = email.getText();
                      cred = new Credentials(uservalue, passvalue,emailvalue);

                      System.out.println("submitted");
                      new RegDone(fn, cred);
                      frame.dispose();
                    }
                    else
                    {
                      JOptionPane.showMessageDialog(null,"Please enter valid Email",
                      "Attention !!!",JOptionPane.WARNING_MESSAGE);
                    }
                  }
                  else
                  {
                    JOptionPane.showMessageDialog(null,"Please enter valid phonenumber",
                    "Attention !!!",JOptionPane.WARNING_MESSAGE);
                  }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Please accept the terms and conditions",
                    "Attention !!!",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
      }
    );
        frame.add(submit);


        back.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ae)
        {
        
          cred = new Credentials("Team15", "Team151234", "Team15@gmail.com");

                        new Home(cred);
                        // frame.dispose();
                        ((JFrame) SwingUtilities.getWindowAncestor(head)).dispose();

        }
     }
    );


        JLabel background = new JLabel("",background_img,JLabel.CENTER);
        background.setBounds(670,90,690,630);
        frame.add(background);

        frame.setIconImage(mainicon.getImage());
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(0xEEEDE7));
    }

}


// class Register
// {
//     public static void main(String []args)
//     {
//         MyFrame frame = new MyFrame();
//     }
// }

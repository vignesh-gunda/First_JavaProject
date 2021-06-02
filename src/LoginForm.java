import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.util.List;


class LoginForm
{

    JFrame frame = new JFrame("LOGIN PAGE");//new frame added
    JLabel title = new JLabel("LOGIN FORM");//password label added
    JButton submitb = new JButton("Login");//login button added
    JButton forgotpasswordb = new JButton("Forgot Password");//forgot password button added
    JButton back = new JButton("Back");//back button added
    JLabel userLabel = new JLabel("Username:");//username label added
    JLabel passLabel = new JLabel("Password:");//password label added
    ImageIcon mainicon = new ImageIcon("images/icon.png");//image added instead of java icon
    JTextField userText = new JTextField();//textfield for username added
    JPasswordField passText = new JPasswordField();//textfield for password added
    //HashMap<String,String> LoginDetails = new HashMap<String,String>();//hashmap for credentials

 Credentials cred;

    LoginForm(Credentials cred)
    {
      this.cred = cred;



      // frame settings
        frame.setSize(800,600);
        frame.setLocation(450,40);


        userLabel.setBounds(180,203,150,45);
        userLabel.setForeground(new Color(0x000000));
        userLabel.setBackground(Color.WHITE);
        userLabel.setOpaque(true);
        userLabel.setFont(new Font("Times New Roman",Font.BOLD,31));
        frame.add(userLabel);


        passLabel.setBounds(180,278,150,45);
        passLabel.setBackground(Color.WHITE);
        passLabel.setOpaque(true);
        passLabel.setForeground(new Color(0x000000));
        passLabel.setFont(new Font("Times New Roman",Font.BOLD,31));
        frame.add(passLabel);


        userText.setBounds(340,200,230,50);
        userText.setFont(new Font("Times New Roman",Font.BOLD,20));
        userText.setBackground(new Color(255,255,255,255));
        frame.add(userText);


        passText.setBounds(340,275,230,50);
        passText.setFont(new Font("Times New Roman",Font.BOLD,20));
        passText.setBackground(new Color(255,255,255,255));
        frame.add(passText);




        submitb.setForeground(new Color(0xFFFFFF));
        submitb.setBounds(320,460,100,60);
        submitb.setFont(new Font("Times New Roman",Font.BOLD,25));
        submitb.setBackground(new Color(0xB95C50));
        submitb.setOpaque(true);
        submitb.setFocusable(false);

        frame.add(submitb);


        forgotpasswordb.setForeground(new Color(0xFFFFFF));
        forgotpasswordb.setBounds(410,350,180,40);
        forgotpasswordb.setFont(new Font("Times New Roman",Font.BOLD,20));
        forgotpasswordb.setBackground(new Color(0xB95C50));
        forgotpasswordb.setOpaque(true);
        forgotpasswordb.setFocusable(false);
        frame.add(forgotpasswordb);


        back.setForeground(new Color(0xFFFFFF));
        back.setBounds(690,30,80,40);
        back.setFont(new Font("Times New Roman",Font.BOLD,18));
        back.setBackground(new Color(0xB95C50));
        back.setOpaque(true);
        back.setFocusable(false);
        //back.addActionListener(this);
        frame.add(back);



        title.setForeground(new Color(0x000000));
        title.setFont(new Font("Times New Roman",Font.BOLD,28));
        frame.add(title);
        title.setBounds(320,30,300,40);







        frame.setIconImage(mainicon.getImage());



        ImageIcon logo = new ImageIcon("images/logo1.png");
        JLabel logoimage = new JLabel("", logo, JLabel.CENTER);
        logoimage.setBounds(0,0, 300, 80);
        frame.add(logoimage);

        ImageIcon img = new ImageIcon("images/loginbg.png");
        JLabel background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,800,600);
        frame.add(background);



        //action listeners

// back action listener
        back.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae)
        {
          new Home(cred);
          frame.dispose();   //ask vignesh why frame.dispose and dispose are not working

        }
        });


//submit action listener

        submitb.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae)
        {
           String userValue = userText.getText();
           String passValue = String.valueOf(passText.getPassword());

           // if((userValue.equals("vignesh") && passValue.equals("vignesh1234")) ||(userValue.equals("mihika") && passValue.equals("mihika1234"))|| (userValue.equals("drishti") && passValue.equals("drishti1234")) || (userValue.equals("prafulla") && passValue.equals("prafulla1234"))|| (userValue.equals("team22") && passValue.equals("team221234")))
           // {
           //   System.out.println("login successful");
           //   userText.setText("");
           //   passText.setText("");
           //   new LoginConfirm(userValue);
           //   frame.dispose();
           // }

           //Credentials cred = new Credentials("", "");
           List<String> list = cred.getList();
           //System.out.println(list);
           int k = 0;
           for(int i=0; i<(list.size()-1); i+=3)
           {
             //System.out.println(list);
             if(userValue.equals(list.get(i)) && passValue.equals(list.get(i+1)))
             {
               System.out.println("login successful");
                 userText.setText("");
                 passText.setText("");
                 new LoginConfirm(userValue, cred);
                 frame.dispose();
                 k=1;
                 break;
             }

             else
             {
               k = 0;
             }
           }


    if(k==0)
    {
      JOptionPane.showMessageDialog(null,"WRONG USERNAME/PASSWORD","Attention !!!",JOptionPane.WARNING_MESSAGE);
    }



        }
        });


        //forgot pw button action listener
        forgotpasswordb.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae)
        {
          //Credentials credentials = new Credentials();
          ForgotPassword forgotpassword = new ForgotPassword(cred);
        }
       });

        frame.getContentPane().setBackground(new Color(0xFFFFFF));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);


    }


}

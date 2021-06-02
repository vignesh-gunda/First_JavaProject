import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;


class ForgotPassword
{


    JFrame frame;
    JButton submit;
    JButton back;
    Credentials cred;

    ForgotPassword(Credentials cred)
    {
      this.cred = cred;

        frame= new JFrame("Forgot Password");//new frame added
        frame.setSize(600,600);//size of frame
        frame.setLocationRelativeTo(null);      //location of frame
        ImageIcon mainicon = new ImageIcon("images/icon.png");//icon image added
        frame.setIconImage(mainicon.getImage());//image added instead of java icon

        back = new JButton("Back");//back button added
        back.setForeground(new Color(0x000000));
        back.setBounds(460,80,80,50);
        back.setFont(new Font("Times New Roman",Font.BOLD,20));
        back.setBackground(new Color(0x52688F));
        back.setForeground(Color.WHITE);
        back.setOpaque(true);
        back.setFocusable(false);
        back.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae)
        {
          frame.dispose();
        }
       });
        frame.add(back);

        JLabel label1 = new JLabel();
        label1.setBounds(0,0,600,60);
        label1.setBackground(new Color(0x52688F));
        label1.setOpaque(true);
        frame.add(label1);

        JLabel label2 = new JLabel("Recover Password");
        label2.setBounds(160,0,240,60);
        label2.setFont(new Font("Times New Roman",Font.BOLD,28));
        label2.setForeground(Color.WHITE);
        label1.add(label2);

        JLabel emailLabel = new JLabel("Enter Email");//email label added
        emailLabel.setBounds(165,135,190,60);
        emailLabel.setForeground(new Color(0x000f00));
        emailLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        frame.add(emailLabel);

        JTextField emailtext = new JTextField();//text field for email added
        emailtext.setBounds(165,180,250,50);
        emailtext.setFont(new Font("Times New Roman",Font.BOLD,18));
        emailtext.setBackground(new Color(255,255,255,255));
        frame.add(emailtext);

        JLabel userLabel = new JLabel("Enter Username");//user label added
        userLabel.setBounds(165,245,200,60);
        userLabel.setForeground(new Color(0x000f00));
        userLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        frame.add(userLabel);

        JTextField usertext = new JTextField();//text field for username added
        usertext.setBounds(165,290,250,50);
        usertext.setFont(new Font("Times New Roman",Font.BOLD,18));
        usertext.setBackground(new Color(255,255,255,255));
        frame.add(usertext);

        submit = new JButton("Submit");//submit button added
        submit.setBounds(230,400,120,60);
        submit.setFont(new Font("Times New Roman",Font.BOLD,20));
        submit.setBackground(new Color(0x52688F));
        submit.setForeground(Color.WHITE);
        submit.setFocusable(false);
        submit.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae)
        {
          String uservalue = usertext.getText();
          String emailvalue = emailtext.getText();
          List<String> list = cred.getList();
          int k=0;

            if(uservalue.equals("") || emailvalue.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter all the Fields","Attention !!!",JOptionPane.INFORMATION_MESSAGE);
            }


          else {

            for(int i=0; i<(list.size()-1); i++)
            {
              //System.out.println(list);
              if(uservalue.equals(list.get(i)) && emailvalue.equals(list.get(i+=2)))
              {

                  usertext.setText("");
                  emailtext.setText("");
                  JOptionPane.showMessageDialog(null,"Password Verification is sent to the given Mail ID","Attention !!!",JOptionPane.INFORMATION_MESSAGE);

                  frame.dispose();
                  k=1;
              }

            }

            if(k==0)
            {
                  JOptionPane.showMessageDialog(null,"WRONG EMAIL/USERNAME","Attention !!!",JOptionPane.WARNING_MESSAGE);
            }
          }

          }



       });
        frame.add(submit);

        ImageIcon forgot = new ImageIcon("images/forgot.png");//background image added
        JLabel background = new JLabel("",forgot,JLabel.CENTER);
        background.setBounds(0,0,600,600);
        frame.add(background);

        frame.getContentPane().setBackground(new Color(0xFFFFFF));//background color of the frame
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
   //  public void actionPerformed(ActionEvent e)
   //  {
   //      if(e.getSource() == submit)
   //      {
   //        String uservalue = usertext.getText();
   //        String emailvalue = emailtext.getText();
   //        List<String> list = cred.getList();
   //        int k=0;
   //
   //        for(int i=0; i<(list.size()-1); i++)
   //        {
   //          //System.out.println(list);
   //          if(uservalue.equals(list.get(i)) && emailvalue.equals(list.get(i+1)))
   //          {
   //
   //              usertext.setText("");
   //              emailtext.setText("");
   //              JOptionPane.showMessageDialog(null,"Password Verification is sent to the given Mail ID","Attention !!!",JOptionPane.INFORMATION_MESSAGE);
   //
   //              new LoginConfirm(uservalue, cred);
   //              frame.dispose();
   //              k=1;
   //              break;
   //          }
   //
   //
   //        }
   //
   //
   // if(k==0)
   // {
   //   JOptionPane.showMessageDialog(null,"WRONG ","Attention !!!",JOptionPane.WARNING_MESSAGE);
   // }
   //
   //      }
   //      if(e.getSource() == back)
   //      {
   //          frame.dispose();
   //      }
   //  }
}

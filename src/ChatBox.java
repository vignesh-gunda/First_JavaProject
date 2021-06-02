import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.File;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import java.net.*;




public class ChatBox{

Credentials cred;

JFrame jf;
JPanel head;
JButton back;
JTextField message;
JButton send;
JTextArea body;
  public ChatBox(Credentials cred) {
    this.cred = cred;
    

            //adding panels,  frames and components
             jf = new JFrame("FORUM");
             head = new JPanel();
             back = new JButton("Back");
             JLabel heading = new JLabel("Batch of 2019");
             message = new JTextField();
             send = new JButton("SEND");
             body = new JTextArea();
             JLabel sentby = new JLabel("Participant's name");



             // head
             jf.add(head);
             head.setLayout(null);
             head.setBounds(0,0,500,50);
             head.setBackground(new Color(0x05445E));

             //title---heading
             heading.setBounds(190, 10, 500, 20);
             heading.setForeground(new Color(0xFFFFFF));
             heading.setFont(new Font("Times New Roman", Font.BOLD, 22));
             head.add(heading);


             // back
             back.setForeground(new Color(0x05445E));
             back.setFont(new Font("Times New Roman", Font.BOLD, 20));
             back.setBackground(Color.WHITE);
             back.setBorder(BorderFactory.createEmptyBorder());
             back.setOpaque(true);
             back.setFocusable(false);
             head.add(back);
             back.setBounds(5,10,60,35);


             //set text area where content will be displayed ----body settings
             body.setBounds(5, 60, 480, 580);
             //body.setBackground(Color.PINK);
             body.setEditable(false);
             body.setLineWrap(true);
             body.setWrapStyleWord(false);
             body.setFont(new Font("Times New Roman", Font.PLAIN, 20));
             jf.add(body);



             //set chat typing box

             message.setBounds(15, 650, 415, 40);
             message.setFont(new Font("Times New Roman", Font.PLAIN, 16));
             jf.add(message);

             send.setForeground(new Color(0xFFFFFF));
             send.setFont(new Font("Times New Roman", Font.BOLD, 18));
             send.setBackground(new Color(0x05445E));
             send.setBorder(BorderFactory.createEmptyBorder());
             send.setOpaque(true);
             send.setFocusable(false);
             send.setBounds(438,652,55,36);
             jf.add(send);


        // participants name to be displayed above the text message they SEND
          sentby.setFont(new Font("Times New Roman", Font.BOLD, 14));
          sentby.setForeground(new Color(0x808080));



             // image for the icon heading

            ImageIcon icon = new ImageIcon("images/icon.png");
            jf.setIconImage(icon.getImage());




            back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
              new HomeLogin(cred);
              ((JFrame) SwingUtilities.getWindowAncestor(head)).dispose();


            }
           });

           send.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae)
           {

            String output = message.getText();
            body.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            body.setText(body.getText() + "\n\n" + "   " + output);
            message.setText("");
           }
         });



             //last important text default settings
             jf.setSize(500, 700);
             jf.setLocationRelativeTo(null);
             jf.setLayout(null);
             jf.setUndecorated(true);
             jf.setVisible(true);


    }


}

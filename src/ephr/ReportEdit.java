package ephr;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;


public class ReportEdit extends  JFrame implements ActionListener{
    JTextField tfname,tfage,tfgender,tfdiagnosed,tfreciept,tfapp;
    JButton submit;
    
    ReportEdit(){
        setLayout(null);
        getContentPane().setBackground(Color.white);
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("images/bgrep.png"));
        Image i5=i4.getImage().getScaledInstance(460,440, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image= new JLabel(i6);
        image.setBounds(0,0,460,440);
        add(image);
//        getContentPane().
        JLabel lblname= new JLabel ("PATIENT NAME");
        lblname.setBounds(60,30,120,30);
        lblname.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblname);
        
        tfname=new JTextField();
        tfname.setBounds(260,30,150,30);
        add(tfname);
        
        JLabel lblage= new JLabel ("AGE");
        lblage.setBounds(60,80,120,30);
        lblage.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblage);
        
        tfage=new JTextField();
        tfage.setBounds(260,80,150,30);
        add(tfage);
        
        JLabel lblgender= new JLabel ("GENDER");
        lblgender.setBounds(60,130,120,30);
        lblgender.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblgender);
          
        tfgender=new JTextField();
        tfgender.setBounds(260,130,150,30);
        add(tfgender);
        
        JLabel lbldiagnosed= new JLabel ("DIAGNOSED WITH");
        lbldiagnosed.setBounds(60,180,200,30);
        lbldiagnosed.setFont(new Font("Serif",Font.PLAIN,17));
        add(lbldiagnosed);
          
        tfdiagnosed=new JTextField();
        tfdiagnosed.setBounds(260,180,150,30);
        add(tfdiagnosed);
        
        JLabel lblreciept= new JLabel ("RECIEPT NO.");
        lblreciept.setBounds(60,230,120,30);
        lblreciept.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblreciept);
          
        tfreciept=new JTextField();
        tfreciept.setBounds(260,230,150,30);
        add(tfreciept);
        
        JLabel lblapp= new JLabel ("APPOINTMENT DATE");
        lblapp.setBounds(60,280,200,30);
        lblapp.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblapp);
        
//        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/hrep.jpeg"));
//        Image i2=i1.getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT);
//        ImageIcon i3=new ImageIcon(i2);
//        JLabel image= new JLabel(i3);
//        image.setBounds(420,20,350,350);
//        add(image);
//        
        tfapp=new JTextField();
        tfapp.setBounds(260,280,150,30);
        add(tfapp);
        
        submit=new JButton("SUBMIT");
        submit.setBounds(150,330,150,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        
        setBounds(350,200,470,440);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
    
        String name = tfname.getText();
        String reciept = tfreciept.getText();
        String dig = tfdiagnosed.getText();
        String app= tfapp.getText();
        String age = tfage.getText();
        String gender = tfgender.getText();
        
        try{
            Conn conn = new Conn();
            String query = "insert into report values('"+name+"','"+age+"','"+gender+"','"+dig+"','"+reciept+"','"+app+"')";
            conn.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Report Sent");
            setVisible(false);
        
        }catch(Exception e){
        e.printStackTrace();
        }
    }
        public static void main(String[] args){
        new ReportEdit();
    }
}

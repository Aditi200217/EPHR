
package ephr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;
public class viewReport extends JFrame implements ActionListener{
    JTable table;
    JTextField tfname,tfage,tfgender;
    JButton back,view;
    viewReport(){
        
        setLayout(null);
        getContentPane().setBackground(Color.white);
//        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/eight.jpg"));
//        Image i2=i1.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
//        ImageIcon i3=new ImageIcon(i2);
//        JLabel image= new JLabel(i3);
//        image.setBounds(500,0,600,600);
//        add(image);

        JLabel lblname= new JLabel ("NAME");
        lblname.setBounds(20,10,80,20);
        lblname.setFont(new Font("Serif",Font.PLAIN,12));
        add(lblname);
        
        tfname=new JTextField();
        tfname.setBounds(100,10,100,20);
        tfname.setEditable(false);
        add(tfname);
        
        JLabel lblage= new JLabel ("AGE");
        lblage.setBounds(250,10,80,20);
        lblage.setFont(new Font("Serif",Font.PLAIN,12));
        add(lblage);
        
        tfage=new JTextField();
        tfage.setBounds(300,10,100,20);
        add(tfage);
        tfage.setEditable(false);
        
        JLabel lblgender= new JLabel ("GENDER");
        lblgender.setBounds(20,40,80,20);
        lblgender.setFont(new Font("Serif",Font.PLAIN,12));
        add(lblgender);
        
        tfgender=new JTextField();
        tfgender.setBounds(100,40,100,20);
        add(tfgender);
        tfgender.setEditable(false);
        
        JLabel l1= new JLabel ("Health Issue");
        getContentPane().setBackground(Color.white);
        l1.setBounds(30,80,100,20);
        l1.setFont(new Font("Serif",Font.BOLD,15));
        add(l1);
        
        JLabel l2= new JLabel ("Reciept No. ");
        l2.setBounds(200,80,100,20);
        l2.setFont(new Font("Serif",Font.BOLD,15));
        add(l2);
        
        JLabel l3= new JLabel ("Date");
        l3.setBounds(390,80,100,20);
        l3.setFont(new Font("Serif",Font.BOLD,15));
        add(l3);
        
        view=new JButton("Show Report");
        view.setBounds(110,440,120,30);
        view.setBackground(Color.BLACK);
        view.setForeground(Color.WHITE);
        view.addActionListener(this);
        add(view);
        
        back=new JButton("Back");
        back.setBounds(270,440,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        table=new JTable();
        table.setBounds(0,100,500,400);
        add(table);
        

        setBounds(300,200,500,600);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==view){
             String name = tfname.getText();
             try {
            Conn conn=new Conn();
            ResultSet rs=conn.s.executeQuery("select * from patientDetails where name = '"+name+"'");
            while(rs.next()){
            tfage.setText(rs.getString(2));
            tfgender.setText(rs.getString(3));
        }
        }
        catch (Exception e){
            e.printStackTrace();
        }
            try {
            Conn conn=new Conn();
            ResultSet rs=conn.s.executeQuery("select dig,reciept,date from report where name = '"+name+"'");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        }
        if(ae.getSource()==back){
        setVisible(false);}
    }
        

    
    public static void main(String[] args){
        new viewReport();
    }
}


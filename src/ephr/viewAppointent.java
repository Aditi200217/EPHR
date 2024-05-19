


package ephr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;
public class viewAppointent extends JFrame implements ActionListener{
    JTable table;
    JTextField tfname,tflicno;
    JButton back,view;
    viewAppointent(){
        
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

        JLabel lbllicno= new JLabel ("LICENSE NO.");
        lbllicno.setBounds(20,40,80,20);
        lbllicno.setFont(new Font("Serif",Font.PLAIN,12));
        add(lbllicno);
        
        tflicno=new JTextField();
        tflicno=new JTextField();
        tflicno.setBounds(100,40,100,20);
        add(tflicno);
        tflicno.setEditable(false);
        
        JLabel l1= new JLabel ("Patient Name");
        getContentPane().setBackground(Color.white);
        l1.setBounds(5,80,100,20);
        l1.setFont(new Font("Serif",Font.BOLD,15));
        add(l1);
        
        JLabel l2= new JLabel ("Age ");
        l2.setBounds(135,80,100,20);
        l2.setFont(new Font("Serif",Font.BOLD,15));
        add(l2);
        
        JLabel l3= new JLabel ("Gender");
        l3.setBounds(220,80,100,20);
        l3.setFont(new Font("Serif",Font.BOLD,15));
        add(l3);
        
        JLabel l4= new JLabel ("Date ");
        l4.setBounds(330,80,100,20);
        l4.setFont(new Font("Serif",Font.BOLD,15));
        add(l4);
        
        JLabel l5= new JLabel ("Time");
        l5.setBounds(440,80,100,20);
        l5.setFont(new Font("Serif",Font.BOLD,15));
        add(l5);
        view=new JButton("Show Appointments");
        view.setBounds(90,440,150,30);
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
        

        setBounds(300,200,515,570);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==view){
             String name = tfname.getText();
             try {
            Conn conn=new Conn();
            
            ResultSet rs=conn.s.executeQuery("select * from doctor where name = '"+name+"'");
            while(rs.next()){
            tflicno.setText(rs.getString(7));
        }
        }
        catch (Exception e){
            e.printStackTrace();
        }
            try {
            Conn conn=new Conn();
            ResultSet rs=conn.s.executeQuery("select name,age,gender,date,time from appointment where doctor = '"+name+"'");
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
        new viewAppointent();
    }
}


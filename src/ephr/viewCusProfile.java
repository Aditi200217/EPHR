/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ephr;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class  viewCusProfile  extends  JFrame implements ActionListener{
    JLabel lblname;
        String text1;
        JTable table;
        JLabel lbllname,lblage,lblgender,lblheight,lblohone,lblaadhar,lblweight,lblemail;
        JTextField tfname,tfage,tfheight,tfphone,tfaadhar,tfweight,tfemail,tfgender;
        JButton change,view;
     viewCusProfile(){

         
         
         setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel heading = new JLabel("PERSONAL DETAILS");
        heading.setBounds(300, 0, 300, 70);
        heading.setFont(new Font("Serif", Font.BOLD,18));
        add(heading);
    

        lblname= new JLabel ("NAME");
        lblname.setBounds(60,50,120,30);
        lblname.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblname);
        
        tfname=new JTextField();
        tfname.setBounds(200,50,150,30);
        tfname.setEditable(false);
        add(tfname);
        

        
        lblage= new JLabel ("AGE");
        lblage.setBounds(60,100,120,30);
        lblage.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblage);
        
        tfage=new JTextField();
        tfage.setBounds(200,100,150,30);
        add(tfage);
        tfage.setEditable(false);
        
        lblgender= new JLabel ("GENDER");
        lblgender.setBounds(60,150,120,30);
        lblgender.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblgender);
        
        
        tfgender=new JTextField();
        tfgender.setBounds(200,150,150,30);
        add(tfgender);
        tfgender.setEditable(false);
        
        lblheight= new JLabel ("HEIGHT(cm)");
        lblheight.setBounds(60,200,120,30);
        lblheight.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblheight);
        
        tfheight=new JTextField();
        tfheight.setBounds(200,200,150,30);
        add(tfheight);
        tfheight.setEditable(false);
        
        lblweight= new JLabel ("WEIGHT");
        lblweight.setBounds(60,250,120,30);
        lblweight.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblweight);
        
        tfweight=new JTextField();
        tfweight.setBounds(200,250,150,30);
        tfweight.setEditable(false);
        add(tfweight);
        
                        
        JLabel lblphone= new JLabel ("PHONE");
        lblphone.setBounds(60,300,120,30);
        lblphone.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblphone);
        
        tfphone=new JTextField();
        tfphone.setEditable(false);
        tfphone.setBounds(200,300,150,30);
        add(tfphone);
        
        
                
        JLabel lblemail= new JLabel ("EMAIL");
        lblemail.setBounds(60,350,120,30);
        lblemail.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblemail);
        
        tfemail=new JTextField();
        tfemail.setEditable(false);
        tfemail.setBounds(200,350,150,30);
        add(tfemail);
        
        JLabel lblaadhar= new JLabel ("AADHAR");
        lblaadhar.setBounds(60,400,120,30);
        lblaadhar.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblaadhar);
        
        tfaadhar=new JTextField();
        tfaadhar.setBounds(200,400,150,30);
        add(tfaadhar);
        tfaadhar.setEditable(false);
        
        view=new JButton("View Details");
        view.setBounds(90,460,120,30);
        view.setBackground(Color.BLACK);
        view.setForeground(Color.WHITE);
        view.addActionListener(this);
        add(view);
        
        change=new JButton("Change Details");
        change.setBounds(250,460,120,30);
        change.setBackground(Color.BLACK);
        change.setForeground(Color.WHITE);
        change.addActionListener(this);
        add(change);


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/patient.jpeg"));
        Image i2=i1.getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(380,60,450,370);
        add(image);
        
        setBounds(350,200,850,570);
        setVisible(true);
     }
     
         public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==change){
            updateCusProfile ucp = new updateCusProfile();
            ucp.tfname.setText(tfname.getText());
        }
        else if(ae.getSource()==view){
                  String name = tfname.getText();
        
        

                try {
            Conn conn=new Conn();
            ResultSet rs=conn.s.executeQuery("select * from patientDetails where name = '"+name+"'");
            while(rs.next()){
            tfname.setText(rs.getString(1));
            tfage.setText(rs.getString(2));
            tfgender.setText(rs.getString(3));
            tfheight.setText(rs.getString(4));
            tfweight.setText(rs.getString(5));
            tfphone.setText(rs.getString(6));
            tfemail.setText(rs.getString(7));
            tfaadhar.setText(rs.getString(8));}
        }
                

        catch (Exception e){
            e.printStackTrace();
        }
            
        }
         }
     public static void main(String[] args){
     new viewCusProfile();
     }


}

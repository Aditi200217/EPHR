/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ephr;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class PatientLogin  extends  JFrame implements ActionListener {
    
    
    JTextField usernumber,password,username;
    JButton login,cancel;
    
PatientLogin(){
    setLayout(null);
    
    getContentPane().setBackground(Color.white);
    
    
        JLabel heading = new JLabel("LOGIN");
        heading.setBounds(200, 5, 300, 70);
        heading.setFont(new Font("Serif", Font.BOLD,18));
        add(heading);

        JLabel name = new JLabel("Name:");
        name.setBounds(40,70,100,30);
        add(name);
        
        
        username = new JTextField(20);
        username.setBounds(150,70,150,30);
        add(username);
        

    
    JLabel number=new JLabel("Number");
    number.setBounds(40,120,100,30);
    add(number);
    
    usernumber=new JTextField();
    usernumber.setBounds(150,120,150,30);
    add(usernumber);
    
    JLabel pass=new JLabel("Password");
    pass.setBounds(40,170,100,30);
    add(pass);
    
    password=new JTextField();
    password.setBounds(150,170,150,30);
    add(password);
    
    login=new JButton("Login");
    login.setBounds(40,240,120,30);
    login.setBackground(Color.BLACK);
    login.setForeground(Color.WHITE);
    login.addActionListener(this);
    add(login);
    
    cancel=new JButton("Cancel");
    cancel.setBounds(180,240,120,30);
    cancel.setBackground(Color.BLACK);
    cancel.setForeground(Color.WHITE);
    cancel.addActionListener(this);
    add(cancel);
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/plogin.jpg"));
    Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image= new JLabel(i3);
    image.setBounds(350,30,200,200);
    add(image);
    
    setBounds(500,200,600,350);
    setVisible(true);
} 
public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==login){
           String name=username.getText();
           String number = usernumber.getText();
           String pass = password.getText();
           try{
             Conn c = new Conn();
             String query = "select * from patientLogin where phone = '"+number+ "'and password = '"+pass+"'";
             ResultSet rs=c.s.executeQuery(query);
             if(rs.next()){
              setVisible(false);
              Dashboard db = new Dashboard();
              db.tfname.setText(name);
              
             }
             else{
              JOptionPane.showMessageDialog(null,"Invalid Username or Password");
              setVisible(false);
             }
           }catch(Exception e){
           e.printStackTrace();
           }
       }
        
       else if(ae.getSource()== cancel){
           setVisible(false);
       }
        
    }
public static void main(String[] args){
        new PatientLogin();
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ephr;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EPHR extends JFrame implements ActionListener   {
    JButton Doctor,PatientSignUp,PatientLogin;
    EPHR(){
    setBounds(0,0,1550,1000);
    setLayout(null);
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/image1.jpg"));
    Image i2=i1.getImage().getScaledInstance(1550,1000, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image= new JLabel(i3);
    image.setBounds(0,0,1550,1000);
    add(image);
    
    JLabel text= new JLabel ("ELECTRONIC HEALTH CARE MANAGEMENT SYSTEM");
    text.setBounds(20,80,1000,50);
    text.setFont(new Font("Serif",Font.BOLD,30));
    text.setForeground(Color.BLACK);
    image.add(text);
    
    JLabel text2= new JLabel ("\"Healthcare for Good. Today. Tommorow. Alaways.\"");
    text2.setBounds(40,130,1000,50);
    text2.setFont(new Font("Serif",Font.ITALIC,23));
    text2.setForeground(Color.RED);
    image.add(text2);
    
    
    String text3="<html><p>As pioneers in the healthcare segment,we understand the importance of trust. And that is why, over the years, we worked on building that trust. We ensure that every product sold through our offline/online stores are checked for their authenticity, quality, and compliance with the Central Drugs Standard Control Organization, the national regulatory body for Indian pharmaceuticals and medical devices.</P></html>";
    JLabel text4= new JLabel (text3);
    text4.setBounds(90,130,500,350);
    text4.setFont(new Font("Tohomas",Font.PLAIN,18));
    text4.setForeground(Color.BLACK);
    image.add(text4);
    
    PatientSignUp= new JButton ("Register as Member ");
    PatientSignUp.setBounds(100,420,170,30);
    PatientSignUp.setFont(new Font("Serif",Font.PLAIN,16));
    PatientSignUp.setForeground(Color.BLACK);
    image.add(PatientSignUp);   
    PatientSignUp.setBackground(Color.BLACK);
    PatientSignUp.setForeground(Color.WHITE);
    PatientSignUp.addActionListener(this);
    
    PatientLogin= new JButton ("Already a Member ");
    PatientLogin.setBounds(290,420,170,30);
    PatientLogin.setFont(new Font("Serif",Font.PLAIN,16));
    PatientLogin.setForeground(Color.BLACK);
    image.add(PatientLogin); 
    PatientLogin.setBackground(Color.BLACK);
    PatientLogin.setForeground(Color.WHITE);
    PatientLogin.addActionListener(this);
    
    
    Doctor= new JButton ("Doctor's Login");
    Doctor.setBounds(250,470,150,30);
    Doctor.setFont(new Font("Serif",Font.PLAIN,16));
    Doctor.setForeground(Color.BLACK);
    image.add(Doctor); 
    Doctor.setBackground(Color.BLACK);
    Doctor.setForeground(Color.WHITE);
    Doctor.addActionListener(this);
    
    setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==PatientSignUp){
            new PatientSignUp();
        }
        else if(ae.getSource()==PatientLogin){
            new PatientLogin();
            
        }
        else if(ae.getSource()==Doctor){
            new DoctorLogin();
        }
}
    
    public static void main(String[] args) {
        new EPHR();
    }

}

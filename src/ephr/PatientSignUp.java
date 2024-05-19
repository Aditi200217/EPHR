/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ephr;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
        
public class PatientSignUp extends JFrame implements ActionListener{
    
    JTextField nameField,phoneField, passwordField;
    JButton signUp;

    PatientSignUp() {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading = new JLabel("SIGN UP");
        heading.setBounds(200, 20, 300, 70);
        heading.setFont(new Font("Serif", Font.BOLD,18));
        add(heading);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(40,100,100,30);
        add(nameLabel);
        
        
        nameField = new JTextField(20);
        nameField.setBounds(150,100,150,30);
        add(nameField);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel .setBounds(40,150,100,30);
        add(phoneLabel );
        
        
        phoneField = new JTextField(20);
        phoneField .setBounds(150,150,150,30);
        add(phoneField );
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(40,200,100,30);
        add(passwordLabel);
        
        
        passwordField = new JTextField(20);
        passwordField.setBounds(150,200,150,30);
        add(passwordField);
        
        
        signUp=new JButton("Sign Up");
        signUp.setBounds(160,260,120,30);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.addActionListener(this);
        add(signUp);
        
            
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/plogin.jpg"));
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(350,80,200,200);
        add(image);

       
        setBounds(500,200,600,400);
        setVisible(true);

    }
        

public void actionPerformed(ActionEvent ae){
        String name = nameField.getText();
        String phone = phoneField.getText();
        String password= passwordField.getText();
        try{
            Conn conn = new Conn();
            String query = "insert into patientLogin  values('"+name+"','"+phone+"','"+password+"')";
            conn.s.executeUpdate(query);
            
            String query2 = "insert into patientDetails  values('"+name+"','','','','','"+phone+"','','')";
            conn.s.executeUpdate(query2);
            
            JOptionPane.showMessageDialog(null,"Registered Successfully");
            setVisible(false);
        
        }catch(Exception e){
        e.printStackTrace();
        }
};
     



    public static void main(String[] args) {
    new PatientSignUp();
    }       
}



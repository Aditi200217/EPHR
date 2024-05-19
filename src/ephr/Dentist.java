
package ephr;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Dentist extends JFrame implements ActionListener{
    JButton book,back;
     
    Dentist(){
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/doc1.jpeg"));
        Image i2=i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(60,30,150,150);
        add(image);
        
        String text1="<html><p>Dr. Vinay Patil <br> B.D.S & M.D.S <br> 10 years of Experience <br> Cosmetic Dentistry<br>Available :  Mon to Sun : 10:00 AM to 9:00 PM <br>92 % Patient Satisfaction Score </P></html>";
    
        JLabel doc1= new JLabel (text1);
        doc1.setBounds(230,10,350,200);
        doc1.setFont(new Font("Serif",Font.PLAIN,17));
        add(doc1);
        
        book=new JButton("Book Appointment");
        book.setBounds(650,90,150,30);
        book.setBackground(Color.BLACK);
        book.setForeground(Color.WHITE);
    //    book.addActionListener(this);
        add(book);
        
        String text2="<html><p>Dr. Rekha Sanjay <br> M.D.S <br> 4 years of Experience <br> General Dentist<br>Available :  Mon to Sun : 12:00 AM to 9:00 PM <br>87% Patient Satisfaction Score </P></html>";        
                
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("images/doc2.jpeg"));
        Image i5=i4.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image2= new JLabel(i6);
        image2.setBounds(60,200,150,150);
        add(image2);
        
        JLabel doc2= new JLabel (text2);
        doc2.setBounds(230,180,350,200);
        doc2.setFont(new Font("Serif",Font.PLAIN,17));
        add(doc2);
        
        book=new JButton("Book Appointment");
        book.setBounds(650,250,150,30);
        book.setBackground(Color.BLACK);
        book.setForeground(Color.WHITE);
    //    book.addActionListener(this);
        add(book);        
        
                
        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("images/doc3.jpeg"));
        Image i8=i7.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel image3= new JLabel(i9);
        image3.setBounds(60,370,150,150);
        add(image3);  
        
        String text3="<html><p>Dr. Samrat Rathore <br> M.D.S <br> 8 years of Experience <br> Periodontal<br>Available :  Mon to Sun : 12:00 AM to 9:00 PM <br>95% Patient Satisfaction Score </P></html>";        
           
        
        JLabel doc3= new JLabel (text3);
        doc3.setBounds(230,350,350,200);
        doc3.setFont(new Font("Serif",Font.PLAIN,17));
        add(doc3);
        
        book=new JButton("Book Appointment");
        book.setBounds(650,420,150,30);
        book.setBackground(Color.BLACK);
        book.setForeground(Color.WHITE);
    //    book.addActionListener(this);
        add(book);
        
        back=new JButton("Book Appointment");
        back.setBounds(650,420,150,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
    //    back.addActionListener(this);
        add(back);

                
                
        setBounds(300,200,900,700); 
        setVisible(true);  
        
    }
    
        public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
        setVisible(false);
        new Dashboard();}
        else if(ae.getSource()==book){
        setVisible(false);
        new Appointment();}
    }
       
    public static void main(String[] args){
        new Dentist();
}   
}

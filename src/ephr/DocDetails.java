
package ephr;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class  DocDetails  extends  JFrame implements ActionListener{
        JLabel lblname,lblage,lblgender,lbldepartment,lblphone;
        JTextField tfname,tfage,tfphone,tfgender,tfdepartment,tflicno;
        JButton back,view;
     DocDetails(){

         
         
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel heading = new JLabel("PERSONAL DETAILS");
        heading.setBounds(300, 0, 300, 70);
        heading.setFont(new Font("Serif", Font.BOLD,18));
        add(heading);
        lblname= new JLabel ("NAME");
        lblname.setBounds(60,70,120,30);
        lblname.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblname);
        
        tfname=new JTextField();
        tfname.setBounds(200,70,150,30);
        tfname.setEditable(false);
        add(tfname);
        

        
        lblage= new JLabel ("AGE");
        lblage.setBounds(60,120,120,30);
        lblage.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblage);
        
        tfage=new JTextField();
        tfage.setBounds(200,120,150,30);
        add(tfage);
        tfage.setEditable(false);
        
        lblgender= new JLabel ("GENDER");
        lblgender.setBounds(60,170,120,30);
        lblgender.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblgender);
        
        
        tfgender=new JTextField();
        tfgender.setBounds(200,170,150,30);
        add(tfgender);
        tfgender.setEditable(false);
        
        lbldepartment= new JLabel ("DEPARTMENT");
        lbldepartment.setBounds(60,220,120,30);
        lbldepartment.setFont(new Font("Serif",Font.PLAIN,17));
        add(lbldepartment);
        
        tfdepartment=new JTextField();
        tfdepartment.setBounds(200,220,150,30);
        add(tfdepartment);
        tfdepartment.setEditable(false);
        
        JLabel lbllicno= new JLabel ("LICENCE NO.");
        lbllicno.setBounds(60,270,120,30);
        lbllicno.setFont(new Font("Serif",Font.PLAIN,17));
        add(lbllicno);
        
        tflicno=new JTextField();
        tflicno.setBounds(200,270,150,30);
        tflicno.setEditable(false);
        add(tflicno);
        
                        
        lblphone= new JLabel ("PHONE");
        lblphone.setBounds(60,320,120,30);
        lblphone.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblphone);
        
        tfphone=new JTextField();
        tfphone.setEditable(false);
        tfphone.setBounds(200,320,150,30);
        add(tfphone);
        
        
        view=new JButton("View Details");
        view.setBounds(120,380,120,30);
        view.setBackground(Color.BLACK);
        view.setForeground(Color.WHITE);
        view.addActionListener(this);
        add(view);
        
        back=new JButton("Back");
        back.setBounds(250,380,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        



        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/profdoc.jpg"));
        Image i2=i1.getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(380,10,350,350);
        add(image);
        
        setBounds(350,200,850,500);
        setVisible(true);
     }
     
         public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==view){
                  String name = tfname.getText();
        
        

                try {
            Conn conn=new Conn();
            ResultSet rs=conn.s.executeQuery("select * from doctor where name = '"+name+"'");
            while(rs.next()){
            tfname.setText(rs.getString(1));
            tfage.setText(rs.getString(2));
            tfgender.setText(rs.getString(3));
            tfdepartment.setText(rs.getString(4));
            tflicno.setText(rs.getString(7));
            tfphone.setText(rs.getString(8));}
        }
                

        catch (Exception e){
            e.printStackTrace();
        }
            
        }
        if(ae.getSource()==back){
        setVisible(false);}
         }
     public static void main(String[] args){
     new DocDetails();
     }


}


package ephr;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class  updateCusProfile  extends  JFrame implements ActionListener{
        JTextField tfname,tfage,tfheight,tfphone,tfaadhar,tfweight,tfemail,tfgender;
        JButton submit,view;
     updateCusProfile(){
         setLayout(null);
       
        getContentPane().setBackground(Color.white);

        JLabel heading = new JLabel("PERSONAL DETAILS");
        heading.setBounds(300, 0, 300, 70);
        heading.setFont(new Font("Serif", Font.BOLD,18));
        add(heading);
        
        JLabel lblname= new JLabel ("NAME");
        lblname.setBounds(60,60,120,30);
        lblname.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblname);
        
        tfname=new JTextField();
        tfname.setBounds(200,60,150,30);
        add(tfname);
        tfname.setEditable(false);
        
        JLabel lblage= new JLabel ("AGE");
        lblage.setBounds(60,110,120,30);
        lblage.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblage);
        
        tfage=new JTextField();
        tfage.setBounds(200,110,150,30);
        add(tfage);
        
        JLabel lblgender= new JLabel ("GENDER");
        lblgender.setBounds(60,160,120,30);
        lblgender.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblgender);
          
        tfgender=new JTextField();
        tfgender.setBounds(200,160,150,30);
        add(tfgender);
        
        JLabel lblheight= new JLabel ("HEIGHT(cm)");
        lblheight.setBounds(60,210,120,30);
        lblheight.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblheight);
        
        tfheight=new JTextField();
        tfheight.setBounds(200,210,150,30);
        add(tfheight);
        
        JLabel lblweight= new JLabel ("WEIGHT(kgs)");
        lblweight.setBounds(60,260,120,30);
        lblweight.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblweight);
        
        tfweight=new JTextField();
        tfweight.setBounds(200,260,150,30);
        add(tfweight);
                
        JLabel lblphone= new JLabel ("PHONE");
        lblphone.setBounds(60,310,120,30);
        lblphone.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblphone);
        
        tfphone=new JTextField();
//        tfphone.setText("854004675");
        tfphone.setEditable(false);
        tfphone.setBounds(200,310,150,30);
        add(tfphone);
        
                
        JLabel lblemail= new JLabel ("EMAIL");
        lblemail.setBounds(60,360,120,30);
        lblemail.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblemail);
        
        tfemail=new JTextField();
        tfemail.setBounds(200,360,150,30);
        add(tfemail);
        
        JLabel lblaadhar= new JLabel ("AADHAR");
        lblaadhar.setBounds(60,410,120,30);
        lblaadhar.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblaadhar);
        
        tfaadhar=new JTextField();
        tfaadhar.setBounds(200,410,150,30);
        add(tfaadhar);

        view=new JButton("LOAD DETAILS");
        view.setBounds(200,470,150,30);
        view.setBackground(Color.BLACK);
        view.setForeground(Color.WHITE);
        view.addActionListener(this);
        add(view);
        
        submit=new JButton("SUBMIT");
        submit.setBounds(450,470,150,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/patient.jpeg"));
        Image i2=i1.getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(380,60,450,370);
        add(image);
        
        setBounds(350,200,850,580);
        setVisible(true);
     }
     
        public void actionPerformed(ActionEvent ae){
         
        if(ae.getSource()==submit){
            String name= tfname.getText();
            String phone=tfphone.getText();
            String age=tfage.getText();
            String height=tfheight.getText();
            String weight=tfweight.getText();
            String email=tfemail.getText();
            String aadhar=tfaadhar.getText();
            String gender=tfgender.getText();
       
     try{
                Conn conn = new Conn();
//                String query2="Update patientDetails set age ='"+age+"' where phone = '"+phone+"'";
//                String query3="Update patientDetails set gender ='"+gender+"' where phone = '"+phone+"'";
//                String query4="Update patientDetails set height ='"+height+"' where phone = '"+phone+"'";
//                String query5="Update patientDetails set weight ='"+weight+"' where phone = '"+phone+"'";
//                String query6="Update patientDetails set email ='"+email+"' where phone = '"+phone+"'";
//                String query7="Update patientDetails set aadhar ='"+aadhar+"' where phone = '"+phone+"'";
                String query2="Update patientDetails set age ='"+age+"' where name = '"+name+"'";
                String query3="Update patientDetails set gender ='"+gender+"' where name = '"+name+"'";
                String query4="Update patientDetails set height ='"+height+"' where name = '"+name+"'";
                String query5="Update patientDetails set weight ='"+weight+"' where name = '"+name+"'";
                String query6="Update patientDetails set email ='"+email+"' where name = '"+name+"'";
                String query7="Update patientDetails set aadhar ='"+aadhar+"' where name = '"+name+"'";
//String query2="Insert into test values ('"+name+"','hii')";
//                
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);
                conn.s.executeUpdate(query4);
                conn.s.executeUpdate(query5);
                conn.s.executeUpdate(query6);
                conn.s.executeUpdate(query7);
                JOptionPane.showMessageDialog(null,"Update Successfull");
                setVisible(false);
            }
        catch(Exception e){
        e.printStackTrace();
        }
        }
        if(ae.getSource()==view){
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
     new updateCusProfile();
     }


}

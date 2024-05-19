
package ephr;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Appointment extends  JFrame implements ActionListener {
        
    JTextField tfname,tfage,tfdate,tfphone,tftime;
    JRadioButton rbfemale,rbmale;
    JComboBox cbdoctor;
    JButton submit;
    Appointment(){
    setLayout(null);
    getContentPane().setBackground(Color.white);
        
        
        
        JLabel lblname= new JLabel ("NAME");
        lblname.setBounds(60,30,120,30);
        lblname.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblname);
        
        tfname=new JTextField();
        tfname.setBounds(200,30,150,30);
        add(tfname);
        
        JLabel lblage= new JLabel ("AGE");
        lblage.setBounds(60,80,120,30);
        lblage.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblage);
        
        tfage=new JTextField();
        tfage.setBounds(200,80,150,30);
        add(tfage);
        
        JLabel lblgender= new JLabel ("GENDER");
        lblgender.setBounds(60,130,120,30);
        lblgender.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblgender);
        
        rbmale=new JRadioButton("MALE");
        rbmale.setBounds(200,130,70,30);
        rbmale.setFont(new Font("Tohoma",Font.PLAIN,14));
        rbmale.setBackground(Color.white);
        add(rbmale);
        
        rbfemale=new JRadioButton("FEMALE");
        rbfemale.setBounds(280,130,90,30);
        rbfemale.setFont(new Font("Tohoma",Font.PLAIN,14));
        rbfemale.setBackground(Color.white);
        add(rbfemale);
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(rbmale);
        bg.add(rbfemale);
        
        JLabel lbldoctor= new JLabel ("DOCTOR");
        lbldoctor.setBounds(60,180,120,30);
        lbldoctor.setFont(new Font("Serif",Font.PLAIN,17));
        add(lbldoctor);
        
        String str[]={"Dr. Rashmi Roy","Dr. Vinay Patil","Dr. Rekha Sanjay","Dr. Samrat Rathore","Dr. Vandita Mathur","Dr. Aman Singh","Dr. Raman Sharma","Dr. Akash Gupta","Dr. Sanjay Raj","Dr. Naveen Mishra","Dr. Riya Ranjan","Dr. Samar Tyagi"};
        
        cbdoctor=new JComboBox(str);
        cbdoctor.setBounds(200,180,150,30);
        cbdoctor.setFont(new Font("Tohoma",Font.PLAIN,14));
        add(cbdoctor);
        
                
        JLabel lbldate= new JLabel ("DATE");
        lbldate.setBounds(60,230,120,30);
        lbldate.setFont(new Font("Serif",Font.PLAIN,17));
        add(lbldate);
        
        tfdate=new JTextField();
        tfdate.setBounds(200,230,150,30);
        add(tfdate);
        
                
        JLabel lbltime= new JLabel ("TIME");
        lbltime.setBounds(60,280,120,30);
        lbltime.setFont(new Font("Serif",Font.PLAIN,17));
        add(lbltime);
        
        tftime=new JTextField();
        tftime.setBounds(200,280,150,30);
        add(tftime);
        
                
        JLabel lblphone= new JLabel ("PHONE");
        lblphone.setBounds(60,330,120,30);
        lblphone.setFont(new Font("Serif",Font.PLAIN,17));
        add(lblphone);
        
        tfphone=new JTextField();
        tfphone.setBounds(200,330,150,30);
        add(tfphone);
        

        submit=new JButton("SUBMIT");
        submit.setBounds(200,430,150,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/app.jpg"));
        Image i2=i1.getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(380,60,350,350);
        add(image);
        
        setBounds(350,200,850,540);
        setVisible(true);
    
    }
//        
    public void actionPerformed(ActionEvent ae){
        String name = tfname.getText();
        String time = tftime.getText();
        String phone = tfphone.getText();
        String date= tfdate.getText();
        String age = tfage.getText();
        
        String gender = null;
        
        if(rbmale.isSelected()){
        gender="Male";
        }
        else if(rbfemale.isSelected()){
        gender="Female";
        }
        
        String doctor=(String) cbdoctor.getSelectedItem();
        try{
            Conn conn = new Conn();
            String query = "insert into appointment values('"+name+"','"+age+"','"+gender+"','"+doctor+"','"+date+"','"+time+"','"+phone+"')";
            conn.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Appointment Booked");
            setVisible(false);
        
        }catch(Exception e){
        e.printStackTrace();
        }
    }
    public static void main(String[] args){
    new Appointment(); 
    }
}






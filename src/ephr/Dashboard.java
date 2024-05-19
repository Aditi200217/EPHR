
package ephr;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
    JTextField tfname;
    JMenu services;
Dashboard(){
    setLayout(null);
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/img6.jpg"));
    Image i2=i1.getImage().getScaledInstance(1550,1000, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image= new JLabel(i3);
    image.setBounds(0,0,1550,1000);
    add(image);
    
    JMenuBar mb = new JMenuBar();
    mb.setBounds(0,0,1550,30);
    image.add(mb);
    
    JMenu profile = new JMenu("PROFILE");
    profile.setFont(new Font("Serif", Font.BOLD,16));
    mb.add(profile);
    profile.setForeground(Color.red);
    
    services = new JMenu("SERVICES");
    services.setFont(new Font("Serif", Font.BOLD,16));
    mb.add(services);
    services.setForeground(Color.red);
    
    JMenu report = new JMenu("REPORT");
    report.setFont(new Font("Serif", Font.BOLD,16));
    mb.add(report);
    report.setForeground(Color.red);
    
    JMenuItem updateProfile = new JMenuItem("Update Profile");
    updateProfile.addActionListener(this);
    profile.add(updateProfile);   
    
    
    
    JMenuItem viewProfile = new JMenuItem("View Profile");
    viewProfile.addActionListener(this);
    profile.add(viewProfile);
    
    JMenuItem viewServices = new JMenuItem("View Services");
    viewServices.addActionListener(this);
    services.add(viewServices);

    JMenuItem healthReport = new JMenuItem("View Health Report");
    healthReport.addActionListener(this);
    report.add(healthReport);    
        
    JLabel text= new JLabel ("ELECTRONIC HEALTHCARE MANAGEMENT SYSTEM");
    text.setBounds(150,80,1500,50);
    text.setFont(new Font("Serif",Font.PLAIN,50));
    text.setForeground(Color.WHITE);
    image.add(text);
    
    tfname=new JTextField();
    tfname.setBounds(200,950,100,30);
    tfname.setEditable(false);
    tfname.setBackground(Color.WHITE);
    add(tfname);
//String name=tfname.getText();
//    JLabel number=new JLabel(name);
//    number.setBounds(40,20,100,30);
//    add(number);



    
    setBounds(0,0,1550,1000);
    
    setVisible(true);
}

    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Update Profile")){
            updateCusProfile ucp = new updateCusProfile();
            ucp.tfname.setText(tfname.getText());
        }
        else if(ae.getActionCommand().equals("View Profile")){
            viewCusProfile vcp = new viewCusProfile();
            vcp.tfname.setText(tfname.getText());
//            new viewCusProfile();
        }        
        else if(ae.getActionCommand().equals("View Services")){
            new services();
        }
        else if(ae.getActionCommand().equals("View Health Report")){
            viewReport vcp = new viewReport();
            vcp.tfname.setText(tfname.getText());
        }   
    }



public static void main(String[] args){
new Dashboard();
}
}

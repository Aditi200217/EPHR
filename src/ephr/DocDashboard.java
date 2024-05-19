


package ephr;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DocDashboard extends JFrame implements ActionListener{
    JTextField tfname;
    JMenu services;
DocDashboard(){
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
    
    JMenu appoint = new JMenu("APPOINTMENT");
    appoint.setFont(new Font("Serif", Font.BOLD,16));
    mb.add(appoint);
    appoint.setForeground(Color.red);
    
    JMenu report = new JMenu("REPORT");
    report.setFont(new Font("Serif", Font.BOLD,16));
    mb.add(report);
    report.setForeground(Color.red);
    
    JMenu events = new JMenu("EVENTS");
    events.setFont(new Font("Serif", Font.BOLD,16));
    mb.add(events);
    events.setForeground(Color.red);
    
    
    
    JMenuItem viewProfile = new JMenuItem("View Profile");
    viewProfile.addActionListener(this);
    profile.add(viewProfile);
    
    JMenuItem seminar = new JMenuItem("Seminar");
    seminar.addActionListener(this);
    events.add(seminar);
    
    JMenuItem viewServices = new JMenuItem("View Appointments");
    viewServices.addActionListener(this);
    appoint.add(viewServices);

    JMenuItem uphealthReport = new JMenuItem("Update Health Report");
    uphealthReport.addActionListener(this);
    report.add(uphealthReport);    
        
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


    
    setBounds(0,0,1550,1000);
    
    setVisible(true);
}

    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Update Profile")){
            updateCusProfile ucp = new updateCusProfile();
            ucp.tfname.setText(tfname.getText());
        }
        else if(ae.getActionCommand().equals("View Profile")){
            DocDetails dd = new DocDetails();
            dd.tfname.setText(tfname.getText());
//            new viewCusProfile();
        }        
        else if(ae.getActionCommand().equals("View Appointments")){
            viewAppointent va = new viewAppointent();
            va.tfname.setText(tfname.getText());
        }
        else if(ae.getActionCommand().equals("Update Health Report")){
             new ReportEdit();
        }
        else if(ae.getActionCommand().equals("Seminar")){
             new seminar();
        }
//        else if(ae.getActionCommand().equals("ADD DRIVERS")){
//            new AddDriver();
//        }
//        else if(ae.getActionCommand().equals("RECEPTION")){
//            new Reception();
//        }
    }



public static void main(String[] args){
new DocDashboard();
}
}

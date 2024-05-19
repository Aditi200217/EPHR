
package ephr;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author ADITI
 */
public class services extends JFrame implements ActionListener{
    JButton ayd,cardio,dentist,diet,gync,exit,neu,sur,phy;
    services(){
        
    setBounds(0,0,1550,1000);
    getContentPane().setBackground(Color.white);
    setLayout(null);
    JLabel heading = new JLabel("SERVICES");
    heading.setBounds(700, 20, 300, 30);
    heading.setFont(new Font("Serif", Font.BOLD,30));
    add(heading);
        
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/ayd.jpg"));
    Image i2=i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image= new JLabel(i3);
    image.setBounds(90,70,250,250);
    add(image);
    
    ayd=new JButton("Ayurvedic");
    ayd.setBounds(150,330,120,30);
    ayd.setBackground(Color.BLACK);
    ayd.setForeground(Color.WHITE);
//    ayd.addActionListener(this);
    add(ayd);

    ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("images/cadi.jpeg"));
    Image i5=i4.getImage().getScaledInstance(160, 160, Image.SCALE_DEFAULT);
    ImageIcon i6=new ImageIcon(i5);
    JLabel image2= new JLabel(i6);
    image2.setBounds(480,120,160,160);
    add(image2);
    
    cardio=new JButton("Cardiologist");
    cardio.setBounds(500,330,120,30);
    cardio.setBackground(Color.BLACK);
    cardio.setForeground(Color.WHITE);
    cardio.addActionListener(this);
    add(cardio);    
    
    
    ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("images/den.jpeg"));
    Image i8=i7.getImage().getScaledInstance(160, 160, Image.SCALE_DEFAULT);
    ImageIcon i9=new ImageIcon(i8);
    JLabel image3= new JLabel(i9);
    image3.setBounds(860,120,160,160);
    add(image3);
    
    dentist=new JButton("Dentist");
    dentist.setBounds(890,330,120,30);
    dentist.setBackground(Color.BLACK);
    dentist.setForeground(Color.WHITE);
    dentist.addActionListener(this);
    add(dentist);    

    ImageIcon i10=new ImageIcon(ClassLoader.getSystemResource("images/diet.jpeg"));
    Image i11=i10.getImage().getScaledInstance(250, 160, Image.SCALE_DEFAULT);
    ImageIcon i12=new ImageIcon(i11);
    JLabel image4= new JLabel(i12);
    image4.setBounds(1170,120,250,160);
    add(image4);
    
    diet=new JButton("Dietitian");
    diet.setBounds(1220,330,120,30);
    diet.setBackground(Color.BLACK);
    diet.setForeground(Color.WHITE);
//    diet.addActionListener(this);
    add(diet);   
            
    ImageIcon i21=new ImageIcon(ClassLoader.getSystemResource("images/gync.jpeg"));
    Image i22=i21.getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT);
    ImageIcon i23=new ImageIcon(i22);
    JLabel image5= new JLabel(i23);
    image5.setBounds(130,460,170,170);
    add(image5);
    
    gync=new JButton("Ayurvwedic");
    gync.setBounds(150,680,120,30);
    gync.setBackground(Color.BLACK);
    gync.setForeground(Color.WHITE);
//    gync.addActionListener(this);
    add(gync);

    ImageIcon i24=new ImageIcon(ClassLoader.getSystemResource("images/phy.png"));
    Image i25=i24.getImage().getScaledInstance(160, 160, Image.SCALE_DEFAULT);
    ImageIcon i26=new ImageIcon(i25);
    JLabel image6= new JLabel(i26);
    image6.setBounds(480,470,160,160);
    add(image6);
    
    phy=new JButton("Physician");
    phy.setBounds(500,680,120,30);
    phy.setBackground(Color.BLACK);
    phy.setForeground(Color.WHITE);
//    phy.addActionListener(this);
    add(phy);    
    
    
    ImageIcon i27=new ImageIcon(ClassLoader.getSystemResource("images/sur.jpg"));
    Image i28=i27.getImage().getScaledInstance(160, 160, Image.SCALE_DEFAULT);
    ImageIcon i29=new ImageIcon(i28);
    JLabel image7= new JLabel(i29);
    image7.setBounds(870,470,160,160);
    add(image7);
    
    sur=new JButton("Surgeon");
    sur.setBounds(890,680,120,30);
    sur.setBackground(Color.BLACK);
    sur.setForeground(Color.WHITE);
//    sur.addActionListener(this);
    add(sur);    

    ImageIcon i30=new ImageIcon(ClassLoader.getSystemResource("images/neu.png"));
    Image i31=i30.getImage().getScaledInstance(230, 200, Image.SCALE_DEFAULT);
    ImageIcon i32=new ImageIcon(i31);
    JLabel image8= new JLabel(i32);
    image8.setBounds(1170,450,230,200);
    add(image8);
    
    neu=new JButton("Neurologist");
    neu.setBounds(1240,680,120,30);
    neu.setBackground(Color.BLACK);
    neu.setForeground(Color.WHITE);
//    neu.addActionListener(this);
    add(neu);
    
    exit=new JButton("Exit");
    exit.setBounds(1220,680,120,30);
    exit.setBackground(Color.BLACK);
    exit.setForeground(Color.WHITE);
//    diet.addActionListener(this);
    add(diet);    
        
    setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
        setVisible(false);
    }
        else if(ae.getSource()==cardio){
        setVisible(false);
        new Cardio();
    }    
        else if(ae.getSource()==dentist){
        setVisible(false);
        new Dentist();
    }
    }
        
    public static void main(String[] args){
        new services();
}
}


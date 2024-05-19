



package ephr;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
public class seminar extends JFrame implements ActionListener{
    JButton book,back;
    seminar(){
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel heading = new JLabel("SEMINAR");
        heading.setBounds(230, 20, 200, 30);
        heading.setFont(new Font("Serif", Font.BOLD,20));
        add(heading);
        String text1="<html><p><h4>Sat, 09 Sep 2023,Jabalpur</h4> <h3>International Conference on Medical and Biological Engineering</h3><small> Welcome to the official website of the International Conference on Medical and Biological Engineering (ICMBE). This conference, organized by TECHNO CONFERENCES, aims to provide a platform for researchers, delegates, and students to share their experience and knowledge in technology application</small>  </P></html>";
    
        JLabel doc1= new JLabel (text1);
        doc1.setBounds(30,30,500,200);
        add(doc1);
        doc1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        doc1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 1) {
            try {
                Desktop.getDesktop().browse(new URI("https://10times.com/icmbe-jabalpur"));
            } catch (IOException | URISyntaxException ex) {
                // handle exception
            }
        }
    }
});
        
        String text2="<html><p><h4>Thu, 21 Sep 2023 ,Hyderabad</h4> <h3>Pharma Impurity Conclave (PIC)</h3><small> A fresh dawn emerges, revealing another intriguing program, but the familiar and persistent challenge remains steadfast. In response to the urgent concern plaguing the pharmaceutical industry, Eminence Business Media takes immense pride in announcing the highly anticipated Pharma Impurity Conclave 2023, a symposium dedicated to solving the stubborn challenges by complying with the esteemed pharma fraternity, on the 7th and 8th of September.</small>  </P></html>";
    
        JLabel doc2= new JLabel (text2);
        doc2.setBounds(30,190,500,200);
        add(doc2);
        doc2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        doc2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 1) {
            try {
                Desktop.getDesktop().browse(new URI("https://10times.com/e1k4-x8f5-z8xk"));
            } catch (IOException | URISyntaxException ex) {
                // handle exception
            }
        }
    }
});
        
        String text3="<html><p><h4>Tue, 03 Oct 2023 ,New Delhi</h4> <h3>Global Summit on 'Recent Advances in PICU' 2023</h3><small> The Institute of Child Health at Sir Ganga Ram Hospital in Delhi, India is hosting a Global Summit on 'Recent Advances in PICU' in the Division of Pediatric Emergency, Critical care, Pulmonology & Allergic disorders..</small>  </P></html>";
    
        JLabel doc3= new JLabel (text3);
        doc3.setBounds(30,340,500,200);
        add(doc3);
        doc3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        doc3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 1) {
            try {
                Desktop.getDesktop().browse(new URI("https://10times.com/e1kr-4909-rfkh"));
            } catch (IOException | URISyntaxException ex) {
                // handle exception
            }
        }
    }
});        
        String text4="<html><p><h4>Fri, 08 - Sun, 10 Sep 2023 ,Chandigarh</h4> <h3>Annual Conference of Indian Society for Surgery of Hand 2023</h3><small> You're invited to ISSHCON 2023, the 46th Annual Conference of the Indian Society for Surgery of The Hand in Chandigarh. The theme is \"Innovate, Improvise and Evolve\" and we hope to learn from your experiences. Join us at the five star hotel, Hotel Mount View.</small>  </P></html>";
    
        JLabel doc4= new JLabel (text4);
        doc4.setBounds(30,490,500,200);
        add(doc4);        
        doc4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        doc4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 1) {
            try {
                Desktop.getDesktop().browse(new URI("https://10times.com/e1kr-x301-p3fk"));
            } catch (IOException | URISyntaxException ex) {
                // handle exception
            }
        }
    }
});
        back=new JButton("Back");
        back.setBounds(200,710,150,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

                
                
        setBounds(400,10,600,800); 
        setVisible(true);  
        
    }
    
        public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
        setVisible(false);
        }
    }
       
    public static void main(String[] args){
        new seminar();
}   
}

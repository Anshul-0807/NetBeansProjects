
package electricity.billing.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class NewCustomer extends JFrame {
    
    JTextField tfname, tfaddress, tfstate, tfcity ;
            
    NewCustomer(){
        setSize(700, 500);
        setLocation(400, 200);
        
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(new Color(173, 216, 230));
        add(p);
        
        JLabel heading = new JLabel("New Customer");
        heading.setBounds(180, 10, 200, 25);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24 ));
        p.add(heading);
        
        JLabel lblname = new JLabel("Customer Name");
        lblname.setBounds(100, 80, 100, 20);
        p.add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(240, 80, 200, 20);
        p.add(tfname);
        
        JLabel lblmeterno = new JLabel("Meter Number ");
        lblmeterno.setBounds(100, 120, 100, 20);
        p.add(lblmeterno);
        
        JLabel lblmeter = new JLabel("Meter Number ");
        lblmeter.setBounds(240, 120, 100, 20);
        p.add(lblmeter);
        
        Random ran = new Random();
        long number = ran.nextLong() % 1000000;
        lblmeter.setText("" + Math.abs(number));
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(100, 160, 100, 20);
        p.add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(240, 160, 200, 20);
        p.add(tfaddress);
        
        
        
        
        
        
        
        
        
        
        
        
        
        setVisible(true);
    }
    
   public static void main(String[] args){
    new NewCustomer();
   } 
    
}

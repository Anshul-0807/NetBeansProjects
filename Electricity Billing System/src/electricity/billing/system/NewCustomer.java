
package electricity.billing.system;
import javax.swing.*;
import java.awt.*;

public class NewCustomer extends JFrame {
 
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
        
        setVisible(true);
    }
    
   public static void main(String[] args){
    new NewCustomer();
   } 
    
}

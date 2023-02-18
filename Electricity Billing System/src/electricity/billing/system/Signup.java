
package electricity.billing.system;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Signup extends JFrame {
    
    Signup(){
        
        setBounds(450, 150,700, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null); 
        
        JPanel panel = new JPanel();
        panel.setBounds(30, 30, 650, 300);
        panel.setBorder(new TitledBorder(new LineBorder(new Color(173, 216, 230), 2), "Create-Account", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(173, 216, 230)));
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        panel.setForeground(new Color(34, 139, 34)); 
        add(panel);
        
        JLabel heading = new JLabel("Create-Account");
        heading.setBounds(100, 50, 140, 20);
        heading.setForeground(Color.GRAY);
        heading.setFont(new font("Tahoma", Font.BOLD, 14));
        panel.add(heading);
          
        
        setVisible(true);
    }
  public static void main(String[] args){
   new Signup();
   }    
}

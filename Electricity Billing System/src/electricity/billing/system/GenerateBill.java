
package electricity.billing.system;
import javax.swing.*;
import java.awt.*;

public class GenerateBill extends JFrame {
    
     GenerateBill(){
         setSize(500, 800);
         setLocation(500, 20);
         
         setLayout(new BorderLayout());
         
         JPanel panel = new JPanel();
         
       
         
         JLabel heading = new JLabel("Generating Bill");
         
         Choice cmonth = new Choice();
         
        cmonth.add("Janaury");
        cmonth.add("February");
        cmonth.add("March");
        cmonth.add("April");
        cmonth.add("May");
        cmonth.add("June");
        cmonth.add("July");
        cmonth.add("August");
        cmonth.add("September");
        cmonth.add("October");
        cmonth.add("November");
        cmonth.add("December");
        
        
        
        JTextArea area = new JTextArea();
        
           
         
         
         
         
         
         
         
         
         setVisible(true);
     }
    
   public static void main (String[] args){
       new GenerateBill();
   } 
}

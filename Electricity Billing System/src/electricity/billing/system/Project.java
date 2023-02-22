
package electricity.billing.system;
import javax.swing.*;
import java.awt.*;




public class Project extends JFrame{
    Project(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(("icon/elect1.jpg")));
        Image i2 = i1.getImage().getScaledInstance(1366, 768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        
        JMenu master = new JMenu("master");
        mb.add(master);
        
        JMenuItem newcustomer = new JMenuItem("new Customer");
        newcustomer.setFont(new Font("monospaced", Font.PLAIN, 12));
        newcustomer.setBackground(Color.WHITE);
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource(("icon/icon1.png")));
        Image image1 = icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(image1));
        master.add(newcustomer);
        
        setLayout(new FlowLayout());
        
       setVisible(true);

    }
    
    public static void main(String[] args){
       new Project();
    }
            
}
   
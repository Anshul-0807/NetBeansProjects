
package electricity.billing.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;





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
        
        JMenu master = new JMenu("Master");
        master.setForeground(Color.BLUE);
        mb.add(master);
        
        JMenuItem newcustomer = new JMenuItem("new Customer");
        newcustomer.setFont(new Font("monospaced", Font.PLAIN, 12));
        newcustomer.setBackground(Color.WHITE);
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource(("icon/icon1.png")));
        Image image1 = icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(image1));
        newcustomer.setMnemonic('D');
        newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent .VK_D, ActionEvent.CTRL_MASK ));
        master.add(newcustomer);
        
        
        JMenuItem customerdetails = new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("monospaced", Font.PLAIN, 12));
        customerdetails.setBackground(Color.WHITE);
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource(("icon/icon2.png")));
        Image image2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        customerdetails.setIcon(new ImageIcon(image2));
        customerdetails.setMnemonic('M');
        customerdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent .VK_M, ActionEvent.CTRL_MASK ));
        master.add(customerdetails);
        
        
        JMenuItem depositdetails = new JMenuItem("Deposit Details");
        depositdetails.setFont(new Font("monospaced", Font.PLAIN, 12));
        depositdetails.setBackground(Color.WHITE);
        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource(("icon/icon3.png")));
        Image image3 = icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        depositdetails.setIcon(new ImageIcon(image3));
        depositdetails.setMnemonic('N');
        depositdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent .VK_N, ActionEvent.CTRL_MASK ));
        master.add(depositdetails);
        
        
        JMenuItem calculatebill = new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("monospaced", Font.PLAIN, 12));
        calculatebill.setBackground(Color.WHITE);
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource(("icon/icon5.png")));
        Image image4 = icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(image4));
        calculatebill.setMnemonic('B');
        calculatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent .VK_B, ActionEvent.CTRL_MASK ));
        master.add(calculatebill);
        
         
        JMenu info = new JMenu("Information");
        info.setForeground(Color.RED);
        mb.add(info);
        
        JMenuItem updateinformation = new JMenuItem(" Update Information");
        updateinformation.setFont(new Font("monospaced", Font.PLAIN, 12));
        updateinformation.setBackground(Color.WHITE);
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource(("icon/icon4.png")));
        Image image5 = icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        updateinformation.setIcon(new ImageIcon(image5));
        updateinformation.setMnemonic('p');
        updateinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent .VK_P, ActionEvent.CTRL_MASK ));
        info.add(updateinformation);
        
        
        JMenuItem viewinformation = new JMenuItem(" View Information");
        viewinformation.setFont(new Font("monospaced", Font.PLAIN, 12));
        viewinformation.setBackground(Color.WHITE);
        ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource(("icon/icon6.png")));
        Image image6 = icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        viewinformation.setIcon(new ImageIcon(image6));
        viewinformation.setMnemonic('L');
        viewinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent .VK_L, ActionEvent.CTRL_MASK ));
        info.add(viewinformation);
        
         JMenu user = new JMenu("User");
        user.setForeground(Color.BLUE);
        mb.add(user);
        
        JMenuItem paybill = new JMenuItem(" Pay Bill ");
        paybill.setFont(new Font("monospaced", Font.PLAIN, 12));
        paybill.setBackground(Color.WHITE);
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource(("icon/icon6.png")));
        Image image7 = icon7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(image7));
        paybill.setMnemonic('L');
        paybill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent .VK_L, ActionEvent.CTRL_MASK ));
        user.add(paybill);
        
        
        
        
        setLayout(new FlowLayout());
        
       setVisible(true);

    }
    
    public static void main(String[] args){
       new Project();
    }
            
}
   
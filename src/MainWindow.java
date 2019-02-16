import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Image;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MainWindow {
	private JFrame frmStockManager;
	private JTextField usrNameField;
	private String userNameField;
	private JLabel lblOpeningStock;
	private JLabel lblClosingStock;
	private JLabel lblSales;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmStockManager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Border emptyBorder = BorderFactory.createEmptyBorder();
		frmStockManager = new JFrame();
		frmStockManager.setBounds(0, 0, 1000, 1000);
		frmStockManager.setUndecorated(true);
		frmStockManager.setResizable(false);
		frmStockManager.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmStockManager.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Work\\Hillbillys-Tralee-Stock-Management\\src\\hillbillys logo sml.jpg"));
		frmStockManager.setTitle("Stock Manager\r\n\r\n");
		frmStockManager.getContentPane().setForeground(Color.WHITE);
		frmStockManager.getContentPane().setLayout(null);
		
		
		JPanel sidepanel = new JPanel();
		sidepanel.setBounds(0, 0, 251, 1181);
		sidepanel.setBackground(new Color(206,174,137));
		frmStockManager.getContentPane().add(sidepanel);
		frmStockManager.getContentPane().setBackground(new Color (255, 243, 221));
		sidepanel.setLayout(null);
		
		usrNameField = new JTextField();
		usrNameField.setForeground(new Color(0, 0, 0));
		usrNameField.setBorder(emptyBorder);
		usrNameField.setBackground(new Color(206, 174, 137));
		usrNameField.setEditable(false);
		usrNameField.setBounds(52, 282, 151, 20);
		sidepanel.add(usrNameField);
		usrNameField.setColumns(10);
		
		JButton lbluserIcon = new JButton();
		lbluserIcon.setBorder(emptyBorder);
		lbluserIcon.setBackground(new Color(206,174,137));
		ImageIcon userIcon1 = setUserPicture("C:\\Work\\Hillbillys-Tralee-Stock-Management\\src\\login.png", lbluserIcon.WIDTH, lbluserIcon.HEIGHT);
		lbluserIcon.setIcon(userIcon1);
		lbluserIcon.setBounds(10, 91, 220, 172);
		sidepanel.add(lbluserIcon);
		
		
		
		JButton btnClose = new JButton("Close");
		btnClose.setBorder(emptyBorder);
		btnClose.setBackground(new Color(255, 243, 221));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(840, 0, 160, 30);
		frmStockManager.getContentPane().add(btnClose);
		
		lblOpeningStock = new JLabel("Opening Stock");
		lblOpeningStock.setBounds(305, 62, 105, 24);
		frmStockManager.getContentPane().add(lblOpeningStock);
		
		lblClosingStock = new JLabel("Closing Stock");
		lblClosingStock.setBounds(464, 62, 105, 24);
		frmStockManager.getContentPane().add(lblClosingStock);
		
		lblSales = new JLabel("Sales");
		lblSales.setBounds(616, 62, 105, 24);
		frmStockManager.getContentPane().add(lblSales);
	}
	
	private ImageIcon setUserPicture(String filename,int width, int height) {
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File(filename));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		Image dimg = img.getScaledInstance(196,160,
		        Image.SCALE_SMOOTH);
		
		ImageIcon imageIcon = new ImageIcon(dimg);
		
		return imageIcon;
	}
	
}

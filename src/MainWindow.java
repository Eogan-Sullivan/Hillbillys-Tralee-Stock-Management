import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Canvas;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 1388, 1046);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnTradChick = new JButton("Traditional Chicken");
		btnTradChick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnTradChick.setBounds(245, 305, 323, 101);
		frame.getContentPane().add(btnTradChick);
		
		JButton btnStandAlone = new JButton("Stand Alone Items"
				+ "");
		btnStandAlone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStandAlone.setBounds(245, 495, 323, 101);
		frame.getContentPane().add(btnStandAlone);
		
		JButton btnSpecialOffers = new JButton("Special Offers");
		btnSpecialOffers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSpecialOffers.setBounds(245, 685, 323, 101);
		frame.getContentPane().add(btnSpecialOffers);
		
		JButton button_2 = new JButton("Fillet Sandwich");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(751, 305, 323, 101);
		frame.getContentPane().add(button_2);
		
		JButton btnWrap = new JButton("Wraps");
		btnWrap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnWrap.setBounds(751, 495, 323, 101);
		frame.getContentPane().add(btnWrap);
		
		JButton btnBarrels = new JButton("Barrels");
		btnBarrels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBarrels.setBounds(751, 685, 323, 101);
		frame.getContentPane().add(btnBarrels);
		
		JPanel panel = new JPanel();
		panel.setBounds(183, 78, 1013, 172);
		frame.getContentPane().add(panel);
	}
}

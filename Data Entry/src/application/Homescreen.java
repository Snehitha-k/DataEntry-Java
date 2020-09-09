package application;
import java.awt.event.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Homescreen {

	JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homescreen window = new Homescreen();
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
	public Homescreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.getContentPane().setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().setForeground(new Color(25, 25, 112));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("STUDENT DATA ENTRY FORM1");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 28));
		lblNewLabel.setForeground(new Color(0, 0, 139));
		lblNewLabel.setBounds(38, 31, 366, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Number of Students :");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_1.setBackground(new Color(240, 128, 128));
		lblNewLabel_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_1.setBounds(38, 96, 234, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(282, 95, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		JButton b = new JButton("OK");
		b.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				int nos=Integer.parseInt(textField.getText());
				
				
				
				Form f=new Form();
				f.getcount(nos);
				frame.dispose();
	
				f.NewScreen();
				
				
				
				
				

			
				
			}
		});
		b.setBackground(new Color(72, 209, 204));
		b.setForeground(new Color(199, 21, 133));
		b.setBounds(167, 158, 89, 23);
		frame.getContentPane().add(b);
		
		
		
		
		
	}
	public Font getFrameContentPaneFont() {
		return frame.getContentPane().getFont();
	}
	public void setFrameContentPaneFont(Font font) {
		frame.getContentPane().setFont(font);
	}
	
	
	
			
			
		
	
}

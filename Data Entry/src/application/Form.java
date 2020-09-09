package application;
import student.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Form extends Homescreen{

	private  JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;

	/**
	 * Launch the application.
	 */
	static int c=1;
	static int s;
	
	
	public static void getcount(int n) {
		 s=n;
		
	}
	public static int get() {
		return (s);
	}
	
	

	public static void NewScreen()  {
		EventQueue.invokeLater(new Runnable() {
		
			public void run() {
				
				if (c <= Form.get()) {
					
				
				
				try {
					
					Form window = new Form();
					c++;
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				}
				
				
				else {
					System.exit(0);
				}
				
			}
			
			
			
			
		});
	}

	/**
	 * Create the application.
	 */
	public Form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		  
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(32, 178, 170));
		frame.setBounds(100, 100, 617, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(25, 25, 112));
		tabbedPane.setBackground(new Color(95, 158, 160));
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int c=1;
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				int c=1;
			}
		});
		
		panel.setBackground(new Color(95, 158, 160));
		tabbedPane.addTab("UG", null, panel, null);
		panel.setLayout(null);
		
				
				
		
		
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel.setBounds(72, 62, 48, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("RollNo");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(72, 97, 48, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Course");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(72, 127, 48, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Departement");
		lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(50, 162, 83, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Branch_ID");
		lblNewLabel_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(60, 199, 73, 15);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("College");
		lblNewLabel_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(72, 236, 48, 14);
		panel.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(185, 59, 154, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(185, 94, 154, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(185, 124, 154, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(185, 159, 154, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(185, 194, 154, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(185, 231, 154, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("Continue");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bachelor b=new Bachelor();
				b.name=textField .getText();
				b.rollno=textField_1.getText();
				b.course=textField_2.getText();
				b.dept=textField_3.getText();
				b.setBranch(textField_4.getText());
				b.setCollege(textField_5.getText());
		
				b.readdata(b.name,b.rollno,b.course,b.dept);
				b.Filewriter(b.name,b.rollno,b.course,b.dept,b.getBranch(),b.getCollege());
				b.printdata();
				
				
				frame.dispose();
				NewScreen();
			}
		});
		btnNewButton.setBounds(61, 302, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(222, 302, 89, 23);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(95, 158, 160));
		tabbedPane.addTab("Masters", null, panel_1, null);
		panel_1.setLayout(null);
		
		
		
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int c=2;
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				int c=2;
			}
		});
		
		JLabel lblNewLabel_6 = new JLabel("Name");
		lblNewLabel_6.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(51, 67, 60, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("RollNo");
		lblNewLabel_7.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(51, 103, 60, 14);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Course");
		lblNewLabel_8.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(51, 141, 60, 14);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Departement");
		lblNewLabel_9.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(38, 182, 93, 14);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Specialization");
		lblNewLabel_10.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(38, 214, 93, 14);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Project");
		lblNewLabel_11.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(51, 251, 60, 14);
		panel_1.add(lblNewLabel_11);
		
		textField_6 = new JTextField();
		textField_6.setBounds(175, 64, 149, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(175, 100, 149, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(175, 138, 149, 20);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(175, 177, 149, 20);
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(175, 211, 149, 20);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(175, 248, 149, 20);
		panel_1.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Continue");
		btnNewButton_2.setBounds(51, 302, 89, 23);
		panel_1.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Masters b=new Masters();
				b.name=textField_6 .getText();
				b.rollno=textField_7.getText();
				b.course=textField_8.getText();
				b.dept=textField_9.getText();
				b.setProject(textField_11.getText());
				b.setSpecialization(textField_10.getText());
		
				b.readdata(b.name,b.rollno,b.course,b.dept);
				b.Filewriter(b.name,b.rollno,b.course,b.dept,b.getProject(),b.getSpecialization());
				b.printdata();
				
				frame.dispose();
				NewScreen();
			}
		});
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.setBounds(207, 302, 89, 23);
		panel_1.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(95, 158, 160));
		tabbedPane.addTab("PHD", null, panel_2, null);
		panel_2.setLayout(null);
		
		
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int c=3;
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				int c=3;
			}
		});
		
		JLabel lblNewLabel_12 = new JLabel("Name");
		lblNewLabel_12.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_12.setBounds(51, 62, 48, 14);
		panel_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("RollNo");
		lblNewLabel_13.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_13.setBounds(51, 94, 48, 14);
		panel_2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Course");
		lblNewLabel_14.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_14.setBounds(51, 128, 48, 14);
		panel_2.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Departement");
		lblNewLabel_15.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_15.setBounds(26, 163, 89, 14);
		panel_2.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Topic");
		lblNewLabel_16.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_16.setBounds(51, 200, 48, 14);
		panel_2.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Supervision");
		lblNewLabel_17.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_17.setBounds(42, 236, 73, 14);
		panel_2.add(lblNewLabel_17);
		
		textField_12 = new JTextField();
		textField_12.setBounds(167, 59, 145, 20);
		panel_2.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(167, 91, 145, 20);
		panel_2.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(167, 125, 145, 20);
		panel_2.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(167, 160, 145, 20);
		panel_2.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(167, 197, 145, 20);
		panel_2.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(167, 233, 145, 20);
		panel_2.add(textField_17);
		textField_17.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Continue");
		btnNewButton_4.setBounds(51, 303, 89, 23);
		panel_2.add(btnNewButton_4);
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Phd b=new Phd();
				b.name=textField_12 .getText();
				b.rollno=textField_13.getText();
				b.course=textField_14.getText();
				b.dept=textField_15.getText();
				b.setTopic(textField_16.getText());
				b.setSupervision(textField_17.getText());
		
				b.readdata(b.name,b.rollno,b.course,b.dept);
				b.Filewriter(b.name,b.rollno,b.course,b.dept,b.getTopic(),b.getSupervision());
				b.printdata();
				
				frame.dispose();
				NewScreen();
			}
		});
		
		JButton btnNewButton_5 = new JButton("Exit");
		btnNewButton_5.setBounds(198, 303, 89, 23);
		panel_2.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(95, 158, 160));
		tabbedPane.addTab("Scienist", null, panel_3, null);
		panel_3.setLayout(null);
		
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int c=4;
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				int c=4;
			}
		});
		
		JLabel lblNewLabel_18 = new JLabel("Name");
		lblNewLabel_18.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_18.setBounds(63, 66, 48, 14);
		panel_3.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("ID");
		lblNewLabel_19.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_19.setBounds(63, 102, 48, 14);
		panel_3.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Area");
		lblNewLabel_20.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_20.setBounds(63, 141, 48, 14);
		panel_3.add(lblNewLabel_20);
		
		
		textField_18 = new JTextField();
		textField_18.setBounds(178, 63, 152, 20);
		panel_3.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(178, 99, 152, 20);
		panel_3.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(178, 138, 152, 20);
		panel_3.add(textField_20);
		textField_20.setColumns(10);
		
		
		
		JButton btnNewButton_6 = new JButton("Continue");
		btnNewButton_6.setBounds(44, 287, 89, 23);
		panel_3.add(btnNewButton_6);
		
		
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scientist b=new Scientist();
				b.name=textField_18 .getText();
				b.setId(textField_19.getText());
				b.setArea(textField_20.getText());
				b.readdata(b.name,b.rollno,b.course,b.dept);
				b.Filewriter(b.name,b.getId(),b.getArea());
				b.printdata();
				
				frame.dispose();
				NewScreen();
			}
		});
		JButton btnNewButton_7 = new JButton("Exit");
		btnNewButton_7.setBounds(216, 287, 89, 23);
		panel_3.add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}

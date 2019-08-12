import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;

public class Driver extends JFrame {
	/**@author Chandler Hiatt
	 * @version last updated 4-7-17
	 * @class Driver - Main class.
	 */
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				Driver frame = new Driver();
				frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Driver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel main = new JPanel();
		JButton comp = new JButton();
		comp.setText("Submit");
		
		comp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//
					if(textField.getText() != ""){
						MyThread thread1 = new MyThread(textField.getText());
						thread1.start();
					}
					if(textField_1.getText() != ""){
						MyThread thread2 = new MyThread(textField_1.getText());
						thread2.start();
					}
					if(textField_2.getText() != ""){
						MyThread thread3 = new MyThread(textField_2.getText());
						thread3.start();
					}
					
					
					//thread3.start();
					//
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			});
		main.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		main.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		main.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		main.add(textField_2);
		textField_2.setColumns(10);
		
		main.add(comp);
		contentPane.add(main);
		
		JLabel lblEnterTheFile = new JLabel("Enter The file names, then press submit.");
		main.add(lblEnterTheFile);
		setVisible(true);
		
		
		
	}

}

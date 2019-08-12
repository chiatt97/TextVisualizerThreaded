import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
/**@author Chandler Hiatt
 * @version last updated 4-7-17
 * @class Output Frame - extends JFrame.
 */
public class OutputFrame extends JFrame {
	
	private String text;
	private int letterCount, wordCount;
	private JPanel contentPane;
	
	public OutputFrame(String text, int letterCount, int wordCount){
		this.text = text;
		this.letterCount = letterCount;
		this.wordCount = wordCount;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel main = new JPanel();
		JTextArea display = new JTextArea ( 16, 58 );
		JScrollPane pane = new JScrollPane(display);
		display.setText("Text: " + text);
		main.add(pane);
	
		//main.add(new JLabel("Text: " + text));
		main.add(new JLabel("Letter Count: " + letterCount + ""));
		main.add(new JLabel("Word Count: " + wordCount + ""));
		contentPane.add(main);
		
		
		setVisible(true);
	}
}

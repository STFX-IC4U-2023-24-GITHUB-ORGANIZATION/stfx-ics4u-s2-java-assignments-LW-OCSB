package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FactorialGUI {

	// variables
	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FactorialGUI window = new FactorialGUI();
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
	public FactorialGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button1 = new JButton("Factorial");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// button code goes here
				
				int n = 0;
				
				
				try  {
					n =	Integer.parseInt(textField1.getText());
				}
				
				catch (Exception e1)  {
					
					textField1.setText("Invalid entry.");
				}
			
			
				textField2.setText(Integer.toString(factorial(n)));
				
				
			}
		});
		button1.setBounds(29, 106, 89, 23);
		frame.getContentPane().add(button1);
		
		textField1 = new JTextField();
		textField1.setBounds(155, 107, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(279, 107, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JLabel label1 = new JLabel("n");
		label1.setBounds(172, 72, 46, 14);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("n!");
		label2.setBounds(291, 72, 46, 14);
		frame.getContentPane().add(label2);
	}

	
	// DESCRIPTION - Calculates factorial of non-negative integer.  Returns -1 if parameter is negative.
	// PARAMETERS - int n
	// RETURN - int
	public static int factorial(int n)  {
		
		int answer = 1;
		
		if (n < 0)  
			// sentinel value
			return -1;
		
		else if ( (n == 0) || (n == 1) )
			return answer;
		
		else  {
			
			while (n > 1)  {
			
				answer = n * answer;
				n--;
			}
			
			return answer;
		}
	}
}
